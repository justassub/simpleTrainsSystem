import React from 'react';
import {TrainComponent} from './TrainComponent';


export var TrainListComponent = (props) => {
    const trains = props.trains.map((train,index) => {
        
         var trainComponent=   <TrainComponent     
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