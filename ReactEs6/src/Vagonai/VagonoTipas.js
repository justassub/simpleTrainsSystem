import React from 'react';
import {NavLink} from 'react-router-dom';
export class VagonoTipas extends React.Component  {    
    render(){
        return(
            <div>
            <h3>Koki vagona noretumete prideti? </h3>
            <NavLink to={"/"+this.props.match.params.id+"/vagonai/add/bazinis"} >
            <button>Bazinis</button></NavLink>
            <NavLink to= {"/"+this.props.match.params.id+"/vagonai/add/krovininis"}>
            <button>Krovininis</button></NavLink>
            <NavLink to ={"/"+this.props.match.params.id+"/vagonai/add/lokomotyvas"}>
            <button>Lokomotyvas</button></NavLink>
            </div>
        );
    }



}