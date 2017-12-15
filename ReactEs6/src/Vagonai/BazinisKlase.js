import React from 'react';
import {NavLink} from 'react-router-dom';
export class BazinisKlase extends React.Component  {    
    render(){
       
        return(
            <div>
            <h3>kokia bazinio vagono klase klase? </h3>
            <NavLink to={"/"+this.props.match.params.id+ "/vagonai/add/bazinis/1"}>
            <button onClick={this.tipas1}>1</button></NavLink>
            <NavLink to={"/"+this.props.match.params.id+ "/vagonai/add/bazinis/2"}>
            <button>2</button></NavLink>
            <NavLink to={"/"+this.props.match.params.id+ "/vagonai/add/bazinis/3"}>
            <button>3</button></NavLink>
            <NavLink to={"/"+this.props.match.params.id+"/vagonai/add"}>
            <button>Nezinau pats ko noriu ,bet nenoriu bazinio vagono</button></NavLink>
            </div>
        );
    }



}