import React from 'react';
import {TrainListComponent} from './TrainListComponent'
import axios from '../../node_modules/axios';


export class TrainListContainer extends React.Component {
    constructor(props) {
        super(props);
        this.state = { trains: []};
    }
    state={
        name:''
    }
    handleSubmit = (event) => {
        const {User} = this.services;
        User.changeUser(this.state.name);
        this.setState( {name : User.currentUser});  
        event.preventDefault();
}
    handleChange = (event) => {
        this.setState( {name : event.target.value});
}

handleChange1 = (event) => {
    this.setState( {name : event.target.value});
}
    componentWillMount = () => {
        axios.get('http://localhost:8081/train-app/trains')
            .then((response) => {
                this.setState({ trains: response.data });
            })
            .catch((error) => {
                console.log(error);
            });

    }
    componentWillMountFindCity = () => {
        axios.get('http://localhost:8081/train-app/trains/findByCity/'+this.state.city)
            .then((response) => {
                this.setState({ trains: response.data });
               
            })
            .catch((error) => {
                console.log(error);
            });
           

    }

    render() {
        
       
         
        return (
<div>
<TrainListComponent trains={this.state.trains}  />
            <div>
           
        <form  onSubmit={this.handleSubmit}>
                <div >
                <button onClick ={this.componentWillMountFindCity}> Paieska Pagal traukiniu miesta </button>
                    <input  placeholder="City" value={this.state.city} onChange={this.handleChange}/>
                </div>
                
                
            </form>
            </div>
            </div>
            
        );
    }
}
   
