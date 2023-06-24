package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment implements Department{

    //butun departmanlari bir field uzerinde tutalim
    public List<Department> childDepartments = new ArrayList<>();

    //departmanlari listeye ekleyelim
    public void add(Department department){
        this.childDepartments.add(department);
    }


    @Override
    public String getName() { //firmadaki tum departmanlarin isimlerini dondursun
        return this.childDepartments.stream().
                                map(d->d.getName()). //finance sales
                                collect(Collectors.joining(",")); //"finance ,sales"
    }

    @Override
    public List<String> getEmployees() { //firmadaki tum calisanlarin isimlerini listelesin
        return this.childDepartments.stream().
                                     flatMap(d->d.getEmployees().stream()).
                                     collect(Collectors.toList());

        //ayni islemi for each ile de yapabilirdik.
    }
}
