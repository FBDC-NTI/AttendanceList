package br.com.tecnotrends.webservices;

public class ServicesSoapProxy implements br.com.tecnotrends.webservices.ServicesSoap {
  private String _endpoint = null;
  private br.com.tecnotrends.webservices.ServicesSoap servicesSoap = null;
  
  public ServicesSoapProxy() {
    _initServicesSoapProxy();
  }
  
  public ServicesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicesSoapProxy();
  }
  
  private void _initServicesSoapProxy() {
    try {
      servicesSoap = (new br.com.tecnotrends.webservices.ServicesLocator()).getServicesSoap();
      if (servicesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicesSoap != null)
      ((javax.xml.rpc.Stub)servicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap() {
    if (servicesSoap == null)
      _initServicesSoapProxy();
    return servicesSoap;
  }
  
  public boolean autenticarUsuario(java.lang.String asUser, java.lang.String asPassWord) throws java.rmi.RemoteException{
    if (servicesSoap == null)
      _initServicesSoapProxy();
    return servicesSoap.autenticarUsuario(asUser, asPassWord);
  }
  
  public void notificarDestinatarios(java.lang.String asProduto, java.lang.Object[] aoArgumentos) throws java.rmi.RemoteException{
    if (servicesSoap == null)
      _initServicesSoapProxy();
    servicesSoap.notificarDestinatarios(asProduto, aoArgumentos);
  }
  
  public java.lang.String dispatch(java.lang.String asCommand) throws java.rmi.RemoteException{
    if (servicesSoap == null)
      _initServicesSoapProxy();
    return servicesSoap.dispatch(asCommand);
  }
  
  
}