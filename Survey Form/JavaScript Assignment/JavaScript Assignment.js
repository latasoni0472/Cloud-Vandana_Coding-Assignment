
// Take a sentence as an input and reverse every word in that sentence.
function reverseSentence(sentence) {
    // Split the sentence into words.
    const words = sentence.split(' ');
  
    // Reverse each word.
    const reversedWords = words.map(word => word.split('').reverse().join(''));
  
    // Join the reversed words back into a sentence.
    return reversedWords.join(' ');
  }
  
  // Perform sorting of an array in descending order.
  function sortArrayDescending(array) {
    // Sort the array using a comparison function.
    array.sort((a, b) => b - a);
  
    // Return the sorted array.
    return array;
  }
  
  // Get the user input.
  const sentence = prompt('Enter a sentence: ');
  const array = prompt('Enter an array: ').split(',');
  
  // Reverse the sentence.
  const reversedSentence = reverseSentence(sentence);
  
  // Sort the array in descending order.
  const sortedArray = sortArrayDescending(array);
  
  // Display the results.
  console.log('Reversed sentence:', reversedSentence);
  console.log('Sorted array:', sortedArray);