<!DOCTYPE html>
<html>
<head>
  <title>Player Registration Form</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <form action="register" method="post">
    <h2>Player Registration Form</h2>

    <input type="text" name="username" placeholder="Enter your name" required>

    <input type="email" name="email" placeholder="Enter your email" required>

    <input type="tel" name="contactnumber" placeholder="Enter contact number" maxlength="10" required>

    <input type="number" name="numberofplayers" placeholder="Number of players" min="1" required>

    <input type="number" name="costperplayer" placeholder="Cost per player" min="0" required>
    <input type="submit" value="Submit">
  </form>
</body>
</html>
