var arr = [5, 2, 9, 1, 5, 6];
var n = arr.length;

for (var i = 0; i < n - 1; i++) {
  for (var j = 0; j < n - i - 1; j++) {
    if (arr[j] < arr[j + 1]) {
      // Swap arr[j] and arr[j+1]
      var temp = arr[j];
      arr[j] = arr[j + 1];
      arr[j + 1] = temp;
    }
  }
}
console.log(arr);