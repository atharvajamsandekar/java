import logo from './logo.svg';
import './App.css';

function App() {
function f(event)
{
alert("you clicked on "+event.target.name);
}


  return (
<div style={{backgroundColor:"red",height:"100h"}}>
<h1 style={{color:"blue"}} >Hello world</h1>
<button name="red" onClick={f}>RED</button>
<button name="blue" onClick={f}>Blue</button>
<button name="yellow" onClick={f}>YELLOW</button>
</div>
);

  }

export default App;