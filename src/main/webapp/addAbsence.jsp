<!-- contains a form to enter absence details -->

<jsp:include page="WEB-INF/views/header.jsp" />

<h2 style="text-align: center; margin: 1rem auto;">Add Absence</h2>
<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <form class="form">
        <div class="form-group mb-3">
          <label for="employeeId">Employee ID</label>
          <input type="text" class="form-control" id="employeeId" placeholder="Enter Employee ID">
        </div>
        <div class="form-group mb-3">
          <label for="absentDate">Absent Date</label>
          <input type="date" class="form-control" id="absentDate">
        </div>
        <button type="submit" class="btn btn-primary bg-color btn-outline-color"
          style="background-color:#5f249f; border-color:#5f249f;">Submit</button>
      </form>
    </div>
  </div>
</div>

<jsp:include page="WEB-INF/views/footer.jsp" />