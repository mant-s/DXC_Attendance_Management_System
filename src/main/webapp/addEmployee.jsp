<!-- contains a form to enter employee details -->

<jsp:include page="WEB-INF/views/header.jsp" />

<h2 style="text-align: center; margin: 1rem auto;">Add Employee</h2>
<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <form class="form">
        <div class="form-group mb-3">
          <label for="employeeId">Employee ID</label>
          <input type="text" class="form-control" id="employeeId" placeholder="Enter Employee ID">
        </div>
        <div class="form-group mb-3">
          <label for="employeeName">Employee Name</label>
          <input type="text" class="form-control" id="employeeName" placeholder="Enter Employee Name">
        </div>
        <div class="form-group mb-3">
          <label for="employeeAddress">Address</label>
          <textarea class="form-control" id="employeeAddress" rows="3"></textarea>
        </div>
        <button type="submit" class="btn btn-primary bg-color btn-outline-color"
          style="background-color:#5f249f; border-color:#5f249f;">Submit</button>
      </form>
    </div>
  </div>
</div>

<jsp:include page="WEB-INF/views/footer.jsp" />