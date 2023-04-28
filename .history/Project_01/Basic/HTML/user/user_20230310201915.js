function generatePermis() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
  opt += '<select class="form-control" id="inputPermission">';
    opt += '<option value="0">========SELECT========</option>
    opt += '<option value="1">Members</option>
    opt += '<option value="2">Authors</option>
    opt += '<option value="3">Managers</option>
    opt += '<option value="4">Administrators</option>
    opt += '<option value="5">Super Admin</option>
  </select>;
}
