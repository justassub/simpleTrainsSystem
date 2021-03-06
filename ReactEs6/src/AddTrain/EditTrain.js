import React from 'react';
import axios from 'axios';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import PropTypes from 'prop-types';
import { EditTrainComponent } from './EditTrainComponent';

export class EditTrain extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            years: 0,
            enterprise: '',
            city: '',           
            history: props.history
        }
    }
    handleChange = (event) => {
        const target = event.target;
        const value = target.value;
        const name = target.id; // iš input tag'o gaunam būsenos objekto raktą reikšmei nustatyti
        this.setState({
                [name]: value
            }
        );
};

        handleClick = (event) => {
            const outputTrain = {
            years: this.state.years,
            enterprise: this.state.enterprise,
            city: this.state.city,            
    };
    
    axios.put("http://localhost:8081/train-app/trains/edit/"+this.props.match.params.id, outputTrain)
        .then((response) => {
            this.setState( {
                years: '',
                enterprise: '',
                city: '',     
                
            });
        })
        .catch((error) => {
            console.log(error);
        });
};

render() {
    return (
        <div>
            
            <EditTrainComponent
                years={this.state.years}
                enterprise={this.state.enterprise}
                city={this.state.city}
                price={this.state.price}               
                onChange={this.handleChange}
                onClick={this.handleClick}
                history={this.state.history}
            />
        </div>
    );
}
}