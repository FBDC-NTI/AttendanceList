/**
 * AttendanceListService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

public interface AttendanceListService extends java.rmi.Remote {
    public long logIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public br.edu.bahiana.attendancelist.service.GetScholarshipPeriodsResponse getScholarshipPeriods(long teacherID) throws java.rmi.RemoteException;
}
