import { Injectable } from '@angular/core';

import { BehaviorSubject } from 'rxjs';

@Injectable()
export class DataService {

  private goals = new BehaviorSubject<any>(['The initial goal', 'Another silly life goal']);
  goal = this.goals.asObservable();

  goal_now = 'test';

  constructor() { }

  changeGoal(goal) {
    this.goals.next(goal)
  }

  setGoal(goal) {
    this.goal_now = goal;
  }

}