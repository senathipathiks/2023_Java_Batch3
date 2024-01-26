// console.log(new Date().toLocaleString('en-us', {  hour: 'numeric' }));
// console.log(new Date().toLocaleString('en-us', {  month: 'long' }));
// console.log(new Date().toLocaleString('en-us', {  year: 'numeric' }));
console.log("Today : "+new Date().toLocaleString('en-us', {  weekday : 'long' }));
console.log("Current Date is  "+new Date().toLocaleString('en-us',{ day : '2-digit'})+" : "+new Date().toLocaleString('en-us',{ month : '2-digit'})+" : "+new Date().toLocaleString('en-us',{ year : '2-digit'}));