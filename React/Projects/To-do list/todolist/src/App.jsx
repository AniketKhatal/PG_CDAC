import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import "bootstrap/dist/css/bootstrap.min.css";
import AppName from './components/AppName';
import AddTodo from './components/AddTodo';
import Todoitem1 from './components/Todoitem1';
import Todoitem2 from './components/Todoitem2';

function App() {
  return <center class='todo-container'>
    <AppName></AppName><hr></hr>
    <AddTodo></AddTodo>
    <Todoitem1></Todoitem1>
    <Todoitem2></Todoitem2>
  </center>
}

export default App
