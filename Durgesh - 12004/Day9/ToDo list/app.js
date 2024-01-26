let addbutton = document.getElementById('add');
let todocon = document.getElementById('todocontainer');
let inputfield = document.getElementById('input');

addbutton.addEventListener('click', function() {
    var paragraph = document.createElement('p')
    paragraph.classList.add('paragraph-styling')
    paragraph.innerText = inputfield.value;
    todocon.appendChild(paragraph);
    inputfield.value = "";
    paragraph.addEventListener('click', function() {
        paragraph.style.textDecoration = "line-through"
    })
    paragraph.addEventListener('dblclick', function() {
       todocon.removeChild(paragraph);
    })
})