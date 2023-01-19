setInterval(() => {
    $('.clock_bar').html(moment().format('D.MM.YYYY HH:mm:ss'))
}, 12000);
setTimeout(() => {
    $('.clock_bar').html(moment().format('D.MM.YYYY HH:mm:ss'))
}, 100);