import React from 'react';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import {NavLink} from 'react-router-dom';
import axios from 'axios';




export class SingleTrainComponent extends React.Component  {    
    
   
render(){
    
    return (
        
       <div className="col-xs-12 col-sm-4 text-center">  
         
        <img src={"https://pbs.twimg.com/profile_images/720089998364512256/aGIADsG7.jpg"}/>   
                    <div className="thumbnail">  
                                  
                    <h2>{this.props.id}</h2>
                    <h3>{this.props.city}</h3>  
                    <h2>{this.props.enterprise}</h2>                                       
                    <p>{this.props.years}  </p>     
                    <NavLink to ={this.props.id+"/vagonai/"}>                 
                    <button> See All amazing vagons this train has </button>
                    </NavLink>
                    <NavLink to ={this.props.id+"/worth"}>
                    <button> Look how much this train is worth </button>
                    </NavLink>
                </div>
                
            </div>
            
        );
    }

};