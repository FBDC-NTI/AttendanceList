/**
 * ServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public interface ServicesSoap extends java.rmi.Remote {
    public boolean autenticarUsuario(java.lang.String asUser, java.lang.String asPassWord) throws java.rmi.RemoteException;
    public void notificarDestinatarios(java.lang.String asProduto, java.lang.Object[] aoArgumentos) throws java.rmi.RemoteException;
    public java.lang.String dispatch(java.lang.String asCommand) throws java.rmi.RemoteException;
}
