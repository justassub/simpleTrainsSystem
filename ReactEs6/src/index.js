import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import {NavigationComponent} from './Navigation/NavigationComponent';
import {TrainListContainer} from './Trains/TrainListContainer'
import {SingleTrainContainer} from './Trains/SingleTrainContainer'
import {TrainAddContainer} from './AddTrain/TrainAddContainer';
import {EditTrain} from './AddTrain/EditTrain'
import { VagonoTipas } from './Vagonai/VagonoTipas';
import { BazinisKlase } from './Vagonai/BazinisKlase';
import {klase1} from './Vagonai/PridetiBaziniVagona/klase1'
import { klase2 } from './Vagonai/PridetiBaziniVagona/klase2';
import { klase3 } from './Vagonai/PridetiBaziniVagona/klase3';
import { LokomotyvoPaskirtis } from './Vagonai/LokomotyvoPaskirtis';
import { Traukiantis } from './Vagonai/PridetiLokomotyva/Traukiantis';
import { stumiantis } from './Vagonai/PridetiLokomotyva/stumiantis';
import { krovininis } from './Vagonai/pridetiKrovininiVagona/krovininis';
import { VagonuContainer } from './VagonuInformacija/VagonuContainer';
import { TrainAddComponent } from './AddTrain/TrainAddComponent';

ReactDOM.render((

      <BrowserRouter>
          <div className="container">
              <NavigationComponent />
              <Switch>
              <Route exact path="/" component={TrainListContainer} />
              <Route exact path="/trains" component={TrainListContainer} />
              <Route exact path="/trains/:id" component={SingleTrainContainer} />
              <Route exact path="/addtrain" component={TrainAddContainer} />
              <Route exact path="/trains/edit/:id" component={EditTrain} />
              <Route exact path="/:id/vagonai/add" component={VagonoTipas} />
              <Route exact path="/:id/vagonai/add/bazinis" component={BazinisKlase} />
              <Route exact path="/:id/vagonai/add/bazinis/1" component={klase1} />
              <Route exact path="/:id/vagonai/add/bazinis/2" component={klase2} />
              <Route exact path="/:id/vagonai/add/bazinis/3" component={klase3} />
              <Route exact path="/:id/vagonai/add/lokomotyvas" component={LokomotyvoPaskirtis}/>
              <Route exact path="/:id/vagonai/add/lokomotyvas/traukiantis" component={Traukiantis}/>
              <Route exact path="/:id/vagonai/add/lokomotyvas/stumiantis" component={stumiantis}/>
              <Route exact path="/:id/vagonai/add/krovininis" component={krovininis}/>
              <Route exact path="/trains/:id/vagonai" component={VagonuContainer}/>
              </Switch>
          </div>
      </BrowserRouter> ),
document.getElementById('root'));