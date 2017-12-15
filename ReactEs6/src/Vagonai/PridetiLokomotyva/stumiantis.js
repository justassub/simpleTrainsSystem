import React from 'react';
import axios from 'axios';
import PropTypes from 'prop-types';
import {BazinisSablonas} from './BazinisSablonas';

export class stumiantis extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            gamintojas: '',
            kiekis: 0,
            kaina: 0, 
            turis:0, 
            galia:0,         
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
            gamintojas: this.state.gamintojas,
            kiekis: this.state.kiekis,
            kaina: this.state.kaina,  
            turis:this.state.turis,
            galia:this.state.galia      
    };
    
    axios.post("http://localhost:8081/train-app/vagonai/+"+this.props.match.params.id+"/add/lokomotyvas/stumiantis", outputTrain)
        .then((response) => {
            this.setState( {
                gamintojas: '',
                kiekis: '',
                kaina: '',  
                turis:''   ,
                galia:''
                
            });
        })
        .catch((error) => {
            console.log(error);
        });
};

render() {
    return (
        <div>
            <BazinisSablonas
                gamintojas={this.state.gamintojas}
                kiekis={this.state.kiekis}
                kaina={this.state.kaina}
                turis={this.state.turis}    
                galia={this.state.galia}           
                onChange={this.handleChange}
                onClick={this.handleClick}
                history={this.state.history}
            />
        </div>
    );
}
}