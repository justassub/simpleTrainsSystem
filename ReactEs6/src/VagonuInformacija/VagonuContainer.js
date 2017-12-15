import React from 'react';
import axios from '../../node_modules/axios';
import {VagonuListComponent} from './VagonuListComponent'

export class VagonuContainer extends React.Component {
    constructor(props) {
        super(props);
        this.state = { trains: []};
    }
    componentWillMount = () => {
        axios.get('http://localhost:8081/train-app/vagonai/'+this.props.match.params.id)
            .then((response) => {
                this.setState({ trains: response.data });
            })
            .catch((error) => {
                console.log(error);
            });

    }

    render() {
       
        return <VagonuListComponent trains={this.state.trains}  />
    }
}