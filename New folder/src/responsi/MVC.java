package responsi;


class MVC {
    public void Gaji_P(){
        VGaji_P vGaji_P = new VGaji_P();
        Model model = new Model();
        Controller controller = new Controller(vGaji_P, model);
    }
    
    public void Data_P(){
        VData_P vData_P = new VData_P();
        Model model = new Model();
        Controller controller = new Controller(vData_P,model);
    }
    
    public void Home(){
        VHome_P vHome_P = new VHome_P();
        Model model = new Model();
        Controller controller = new Controller(vHome_P, model);
    }
    
    public void Informasi_P(){
        VInformasi_P vInformasi_P = new VInformasi_P();
        Model model = new Model();
        Controller controller = new Controller(vInformasi_P, model);
    }
    
}
