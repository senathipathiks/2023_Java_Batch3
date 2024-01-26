<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    body {
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
      margin: 0;
    }

    .chess-board {
      display: grid;
      grid-template-columns: repeat(8, 50px);
      grid-template-rows: repeat(8, 50px);
    }

    .square {
      width: 50px;
      height: 50px;
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: 20px;
    }

    .dark {
      background-color: #769656;
      color: white;
    }

    .light {
      background-color: #eedc82;
      color: #333;
    }
  </style>
</head>
<body>
  <div class="chess-board">
    <!-- Generate chess board squares using loop -->
    <?php
      $letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];

      for ($row = 8; $row >= 1; $row--) {
        for ($col = 0; $col < 8; $col++) {
          $squareClass = ($row + $col) % 2 == 0 ? 'light' : 'dark';
          echo '<div class="square ' . $squareClass . '">' . $letters[$col] . $row . '</div>';
        }
      }
    ?>
  </div>
</body>
</html>
