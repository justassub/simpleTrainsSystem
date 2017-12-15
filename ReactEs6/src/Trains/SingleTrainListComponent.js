import React from 'react';
import {SingleTrainComponent} from './SingleTrainComponent'


export var SingleTrainListComponent = (props) => {
    const trains = props.trains.map((train,index) => {
        
         var trainComponent=   <SingleTrainComponent     
                key={index}   
                years={train.years}  
                enterprise={train.enterprise}   
                city={train.city}   
                 id={train.id}                
                
                
                history={props.history}

            />;
            return (trainComponent
            );
            
        
    });
    return (
        <div>
            {trains}
        </div>
    );
};