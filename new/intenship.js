let arr = [2,2,2,2,2];
let sum = 0;
let map = new Map();
for(let i=0;i<arr.length;i++){
   sum=sum+arr[i];
   if(!map[arr[i]]){
       map[arr[i]]=1;
   }else{
       map[arr[i]] += 1;
   }
}
let avg = sum/arr.length;
console.log(map[avg]);
