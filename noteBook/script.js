// Show Content list
const contentList = document.querySelector('.contentList');
const menuIcon = document.getElementById('menuIcon');

menuIcon.addEventListener('click', () => {
    if(contentList.style.display === 'none') {
        contentList.style.display = 'block';
        menuIcon.src = "./images/menuOpened.svg";
    } else {
        contentList.style.display = 'none';
        menuIcon.src = "./images/menuClosed.svg";
    }
})

// Switch content

const theoryCoverPage = document.getElementById('theoryCoverPage');
const theoryIntroduction = document.getElementById('theoryIntroduction');
const theoryCh01 = document.getElementById('theoryCh01');
const theoryCh02 = document.getElementById('theoryCh02');
const theoryCh03 = document.getElementById('theoryCh03');
const theoryCh04 = document.getElementById('theoryCh04');
const theoryCh05 = document.getElementById('theoryCh05');
const theoryCh06 = document.getElementById('theoryCh06');
const theoryCh07 = document.getElementById('theoryCh07');
const theoryCh08 = document.getElementById('theoryCh08');
const theoryCh09 = document.getElementById('theoryCh09');
const theoryCh10 = document.getElementById('theoryCh10');
const theoryCh11 = document.getElementById('theoryCh11');
const theoryCh12 = document.getElementById('theoryCh12');
const theoryCh13 = document.getElementById('theoryCh13');
const theoryCh14 = document.getElementById('theoryCh14');
const theoryCh15 = document.getElementById('theoryCh15');
const theoryCh16 = document.getElementById('theoryCh16');

const coverPage = document.getElementById('coverPage');
const Introduction = document.getElementById('Introduction');
const ch01 = document.getElementById('Ch01');
const ch02 = document.getElementById('Ch02');
const ch03 = document.getElementById('Ch03');
const ch04 = document.getElementById('Ch04');
const ch05 = document.getElementById('Ch05');
const ch06 = document.getElementById('Ch06');
const ch07 = document.getElementById('Ch07');
const ch08 = document.getElementById('Ch08');
const ch09 = document.getElementById('Ch09');
const ch10 = document.getElementById('Ch10');
const ch11 = document.getElementById('Ch11');
const ch12 = document.getElementById('Ch12');
const ch13 = document.getElementById('Ch13');
const ch14 = document.getElementById('Ch14');
const ch15 = document.getElementById('Ch15');
const ch16 = document.getElementById('Ch16');

const theoryChArr = [
    theoryCoverPage,
    theoryIntroduction,
    theoryCh01,
    theoryCh02,
    theoryCh03,
    theoryCh04,
    theoryCh05,
    theoryCh06,
    theoryCh07,
    theoryCh08,
    theoryCh09,
    theoryCh10,
    theoryCh11,
    theoryCh12,
    theoryCh13,
    theoryCh14,
    theoryCh15,
    theoryCh16,
]

function displayNoContent() {
    for (let index = 0; index < theoryChArr.length; index++) {
        const element = theoryChArr[index];
        element.style.display = 'none';
    }
}

document.addEventListener('DOMContentLoaded', () => {
    contentList.style.display = 'none';
    menuIcon.src = "./images/menuClosed.svg";
    displayNoContent();
    theoryCh01.style.display = 'flex';
})

coverPage.addEventListener('click', () => {displayNoContent();theoryCoverPage.style.display = 'flex';})
Introduction.addEventListener('click', () => {displayNoContent();theoryIntroduction.style.display = 'flex';})
ch01.addEventListener('click', () => {displayNoContent();theoryCh01.style.display = 'flex';})
ch02.addEventListener('click', () => {displayNoContent();theoryCh02.style.display = 'flex';})
ch03.addEventListener('click', () => {displayNoContent();theoryCh03.style.display = 'flex';})
ch04.addEventListener('click', () => {displayNoContent();theoryCh04.style.display = 'flex';})
ch05.addEventListener('click', () => {displayNoContent();theoryCh05.style.display = 'flex';})
ch06.addEventListener('click', () => {displayNoContent();theoryCh06.style.display = 'flex';})
ch07.addEventListener('click', () => {displayNoContent();theoryCh07.style.display = 'flex';})
ch08.addEventListener('click', () => {displayNoContent();theoryCh08.style.display = 'flex';})
ch09.addEventListener('click', () => {displayNoContent();theoryCh09.style.display = 'flex';})
ch10.addEventListener('click', () => {displayNoContent();theoryCh10.style.display = 'flex';})
ch11.addEventListener('click', () => {displayNoContent();theoryCh11.style.display = 'flex';})
ch12.addEventListener('click', () => {displayNoContent();theoryCh12.style.display = 'flex';})
ch13.addEventListener('click', () => {displayNoContent();theoryCh13.style.display = 'flex';})
ch14.addEventListener('click', () => {displayNoContent();theoryCh14.style.display = 'flex';})
ch15.addEventListener('click', () => {displayNoContent();theoryCh15.style.display = 'flex';})
ch16.addEventListener('click', () => {displayNoContent();theoryCh16.style.display = 'flex';})