function Todoitem2(){
    let todoitem="Buy Gwagan";
    let tododate="4/10/23";
    return <div>
    <div class="row">
      <div class="col-5">{todoitem}</div>
      <div class="col-4">{tododate}</div>
      <div class="col-3"><button type="button" class="btn btn-danger">delete</button></div>
    </div><br></br>

    </div>
}
export default Todoitem2;