// cách xử lý kịch bản cho index.html

// khai báo biến - 3 cách
var def = "----tìm kiếm----";
let emp = "";
const value = "";
// concrete function >< abstract function
function setFirstTime() {
  window.document.frmSearch.txtKeyWord.value = def;
}
function setFirstTimeV2() {
  document.getElementById("txtKeyWord").value = def;
  // document.getElementById('frmSearch').txtKeyWord.value = def;
  let fn = document.getElementById("frmSearch");
}
function setFirstTimeV3(fn) {
  // Truyền tham chiếu đối tượng form
  fn.txtKeyWord.value = def;
}

function setKeyWord(fn, isClick) {
  // lấy giá trị
  let key = fn.txtKeyWord.value;
  if (isClick) {
    if (key.trim() == def) {
      fn.txtKeyWord.value = emp;
    }
  } 
  else {
    if (key.trim() == emp) {
      fn.txtKeyWord.value = def;
    }
  }
}

function checkValidKeyWord(fn) {
    let key = fn.txtKeyWord.value;
    var mess = 'Please input keyword for search';
    if ((key.trim() == def) || (key.trim() == emp)) {
        window.alert(mess);
        txt
    }
}
