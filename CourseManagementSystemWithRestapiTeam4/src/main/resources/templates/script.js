// Declare async function
async function getWeatherAW() {
  const result = await fetch(`http://localhost:8080/courses`);

  const data = await result.json();
console.log(data)
}