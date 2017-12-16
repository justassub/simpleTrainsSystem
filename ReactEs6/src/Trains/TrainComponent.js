import React from 'react';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import {NavLink} from 'react-router-dom';
import axios from 'axios';
import {styles} from '../styles';

const colorStyle={
    color:styles.color
};
   


export class TrainComponent extends React.Component  {    
    removeTrain=()=> {
        axios.delete('http://localhost:8081/train-app/trains/remove/'+this.props.id)                
    }
    
   
render(){
    
    return (
       <div className="col-xs-12 col-sm-4 text-center">       
                    <div className="thumbnail">  
                    <img src={"https://pbs.twimg.com/profile_images/720089998364512256/aGIADsG7.jpg"}/>              
                    <h2>{this.props.id}</h2>
                    <h3>{this.props.city}</h3>  
                    <h2>{this.props.enterprise}</h2>                                       
                    <p>{this.props.years}  </p>   
                   
                       
                    <NavLink to={"/trains/"+this.props.id}>  
                    <button  className="btn btn-default" onClick={this.getTrain}  >
                    TRAIN INFO</button></NavLink>
                    <NavLink to={"/trains/edit/"+this.props.id}>  
                    <button  className="btn btn-default" onClick={this.getTrain}  >
                   EDIT Train</button></NavLink>  
                   <NavLink to ={this.props.id+"/vagonai/add"}>
                   <button> PRIDETI VAGONA</button> </NavLink>             
                   <button style={colorStyle} className="btn btn-default" onClick={this.removeTrain}  >
                   REMOVE TRAIN</button>
                </div>
            </div>
        );
    }

};