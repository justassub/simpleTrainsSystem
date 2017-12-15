import React from 'react';
import axios from '../../node_modules/axios';
import { SingleTrainListComponent } from './SingleTrainListComponent';

export class SingleTrainContainer extends React.Component {
    constructor(props) {
        super(props);
        this.state = { trains: []};
    }
    componentWillMount = () => {
        axios.get('http://localhost:8081/train-app/trains/'+this.props.match.params.id)
            .then((response) => {
                this.setState({ trains: response.data });
            })
            .catch((error) => {
                console.log(error);
            });

    }

    render() {
       
        return <SingleTrainListComponent trains={this.state.trains}  />
    }
}