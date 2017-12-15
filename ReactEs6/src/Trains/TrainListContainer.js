import React from 'react';
import {TrainListComponent} from './TrainListComponent'
import axios from '../../node_modules/axios';


export class TrainListContainer extends React.Component {
    constructor(props) {
        super(props);
        this.state = { trains: []};
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

    render() {
       
        return <TrainListComponent trains={this.state.trains}  />
    }
}