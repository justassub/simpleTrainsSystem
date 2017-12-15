import React from 'react';
import axios from 'axios';
import {EditComponent} from './EditComponent'
import PropTypes from 'prop-types';
import {ProductDetailsContainer} from '../ProductDetails/ProductDetailsContainer'

export class EditContainer extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            title: '',
            image: '',
            description: '',
            price: 0,
            quantity: 0,
            history: {}
        }
    }

    componentWillMount = () => {
        axios.get('http://localhost:8081/api/users/'+this.props.match.params.id)
            .then((response) => {
                this.setState({ products: response.data });
            })
            .catch((error) => {
                console.log(error);
            });

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
        event.preventDefault();
        const outputProduct = {
            description: this.state.description,
            image: this.state.image,
            price: this.state.price,
            quantity: this.state.quantity,
            title: this.state.title
        };

        axios.put('http://localhost:8081/hello-world-calc1/produktai/' + this.props.match.params.id, outputProduct)
        //axios.put("https://itpro2017.herokuapp.com/api/products/" + this.props.match.params.id, outputProduct)
            .then((response) => {
                this.props.history.goBack();
            })
            .catch((error) => {
                console.log(error);
            });
    };

    render() {
        return (
            <div>
                
                <EditComponent
                    title={this.state.title}
                    image={this.state.image}
                    description={this.state.description}
                    price={this.state.price}
                    quantity={this.state.quantity}
                    onChange={this.handleChange}
                    onClick={this.handleClick}
                    history={this.state.history}
                />
            </div>
        );
    }
}