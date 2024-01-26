const btnstart = document.querySelector('.start');
const btnstop = document.querySelector('.stop');
const btnreset = document.querySelector('.reset');
let hrs=min=sec=ms=0;
btnstart.addEventListener('click',()=>{
   
});
btnstop.addEventListener('click',()=>{

});
btnreset.addEventListener('click',()=>{
     hrs=min=sec=ms=0;
    updateDisplay();
});
function updateDisplay(){
    hrs=hrs<10?'0'+hrs:hrs;
    min=min<10?'0'+min:min;
    sec=sec<10?'0'+sec:sec;
    ms=ms<10?'0'+ms:ms;
    document.querySelector('.hrs').innerText=hrs;
    document.querySelector('.min').innerText=min;
    document.querySelector('.sec').innerText=sec;
    document.querySelector('.ms').innerText=ms;
}