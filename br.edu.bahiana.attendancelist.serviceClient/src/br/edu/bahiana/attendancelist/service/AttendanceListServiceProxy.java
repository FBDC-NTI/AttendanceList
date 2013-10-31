package br.edu.bahiana.attendancelist.service;

public class AttendanceListServiceProxy implements br.edu.bahiana.attendancelist.service.AttendanceListService {
  private String _endpoint = null;
  private br.edu.bahiana.attendancelist.service.AttendanceListService attendanceListService = null;
  
  public AttendanceListServiceProxy() {
    _initAttendanceListServiceProxy();
  }
  
  public AttendanceListServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAttendanceListServiceProxy();
  }
  
  private void _initAttendanceListServiceProxy() {
    try {
      attendanceListService = (new br.edu.bahiana.attendancelist.service.AttendanceListServiceServiceLocator()).getAttendanceListService();
      if (attendanceListService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)attendanceListService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)attendanceListService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (attendanceListService != null)
      ((javax.xml.rpc.Stub)attendanceListService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.edu.bahiana.attendancelist.service.AttendanceListService getAttendanceListService() {
    if (attendanceListService == null)
      _initAttendanceListServiceProxy();
    return attendanceListService;
  }
  
  public long logIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (attendanceListService == null)
      _initAttendanceListServiceProxy();
    return attendanceListService.logIn(username, password);
  }
  
  public br.edu.bahiana.attendancelist.service.GetScholarshipPeriodsResponse getScholarshipPeriods(long teacherID) throws java.rmi.RemoteException{
    if (attendanceListService == null)
      _initAttendanceListServiceProxy();
    return attendanceListService.getScholarshipPeriods(teacherID);
  }
  
  
}