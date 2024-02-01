let arr = [1,2,4,5,6,7,8,15,87,45];

divByFive(arr);

function divByFive(arr) {
    arr.forEach(e => {
        if (e%5 == 0) {
            console.log(e);
        }
    });
}
