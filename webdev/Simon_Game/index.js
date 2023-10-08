var button=["red","blue","yellow","green"]
var started=false;
var gamePat=[];
var userPat=[];
var lvl=0;

$(document).keypress(function() {
    if (!started) {
        $("h1").text("Level " + lvl);
        nextSeq();
        started = true;
    }
});

$(".btn").click(function(){
    var userClick=$(this).attr("id");
    userPat.push(userClick);
    playSound(userClick);
    animatePress(userClick);
    checkAnswer(userPat.length-1);
})

function checkAnswer(Level) {
    if (gamePat[Level] === userPat[Level]) {
        console.log("success");
        if (userPat.length === gamePat.length){
            setTimeout(function () {
            nextSeq();
            }, 1000);
        }
    }else{
        var audio = new Audio("sounds/wrong.mp3");
        audio.play();
        $("body").addClass("game-over");
        setTimeout(function () {
            $("body").removeClass("game-over");
        }, 200);
        $("h1").text("Game Over, Press Any Key to Restart");
        startOver();
    }
}
function nextSeq(){
    userPat=[];

    var randomNum= Math.floor(Math.random()*4);
    var chosenBut= button[randomNum];
    gamePat.push(chosenBut);
    $("#" + chosenBut).fadeIn(100).fadeOut(100).fadeIn(100);
    playSound(chosenBut);
    lvl++;
    $("h1").text("Level "+lvl);
}

function playSound(color){
    var audio = new Audio("sounds/" + color + ".mp3");
    audio.play();
}

function animatePress(color){
    $("#" + color).addClass("pressed");
    setTimeout(function () {
        $("#" + color).removeClass("pressed");
    }, 100);
}

function startOver(){
    started=false;
    gamePat=[];
    userPat=[];
    lvl=0;
}
