const arr = [6, 7, 3, 8, 2, 9, 4, 5];
const thirdSmallest = () => {
   const copy = arr.slice();
   for(let i = 0; i < 2; i++){
      const minIndex = copy.indexOf(Math.min(...copy));
      copy.splice(minIndex, 1);
   };
   return Math.min(...copy);
};
document.write(thirdSmallest(arr));