// cách xử lý kịch bản cho index.html

// khai báo biến - 3 cách
var def = '----tìm kiếm';
let emp = "";
const value = "";
// concrete function >< abstract function 
function setFirstTime() {
    window.document.frmSearch.txtKeyWord.value = def;
}
function setFirstTimeV2() {
    document.getElementById('txtKeyWord').value = def;
    // document.getElementById('frmSearch').txtKeyWord.value = def;
}

function setFirstTimeV3(fn) {

}