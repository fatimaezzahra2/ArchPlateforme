package org.emsi.platformarch.service;

import com.google.cloud.firestore.QuerySnapshot;
import org.emsi.platformarch.clustering.Centroid;
import org.emsi.platformarch.clustering.Record;
import org.emsi.platformarch.entities.Charges;
import org.emsi.platformarch.entities.Project;
import org.emsi.platformarch.entities.Userr;
import org.emsi.platformarch.firebaseData.WeatherForecast;
import org.emsi.platformarch.requests.AlgoTwoRequest;
import org.emsi.platformarch.requests.ManagementRequest;
import org.emsi.platformarch.requests.SizingPvRequest;
import org.emsi.platformarch.requests.SizingWtRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface IPlatService {
    Userr saveUser(Userr user);
    Project saveProject(Project project);
    void deleteProjectById(String id);
    Charges saveOrUpdateCharge(Charges charges);
    List<Project> findAllProjects();
    List<Userr> findAllUsers();
    List<Charges> findAllCharges();
    Project findByName(String name);

    ResponseEntity<Project> findProjectById(String id);

    ResponseEntity<Charges> findChargeById(String id);
    void addChargeToProject(String projectId, Charges charge);
    List<Charges> findChargesByProject(String projectId);
     long[] calculateEnergy(List<Charges> charges);
     double sizingBattery(String projectId, int Nj,float D,int U);
    double sizingWt(SizingWtRequest wtRequest) throws ExecutionException, InterruptedException;
    double[] sizingPv(SizingPvRequest sizingPvRequest) throws ExecutionException, InterruptedException;
    void deleteChargeById(String id);
    void uploadData(double longitude, double latitude,String projectId);
    QuerySnapshot getData() throws ExecutionException, InterruptedException;
    double[][] algo3(ManagementRequest managementRequest) throws ExecutionException, InterruptedException;
    double algo2(AlgoTwoRequest algoTwoRequest) throws ExecutionException, InterruptedException;
    Map<Centroid, List<Record>> clustering (double [][] P);

    }
