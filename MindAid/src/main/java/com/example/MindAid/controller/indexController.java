package com.example.MindAid.controller;

import com.example.MindAid.model.*;
import com.example.MindAid.repository.*;
import com.example.MindAid.request.Signup_request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class indexController {

    @Autowired
    userRepository user_repository;
    @Autowired
    Signup_request signup_request;

    @Autowired
    ConsentRepository consent_repusitory;

    @Autowired
    PaymentRepository payment_repository;
    @Autowired
    TherapistRepository therapistRepository;
    @Autowired
    ScheduleRepository scheduleRepository;
    @Autowired
    UpdateScheduleRepository updateScheduleRepository;






    @GetMapping("/login")
    public String getLogin(Model model){
        Login login=new Login();
        model.addAttribute(login);
        return "login_html";
    }
    @PostMapping("/postlogininfo")
    public String postLogin(Login login,Model model) {
        DocSelect docSelect = new DocSelect();


        List<User> user = user_repository.findByEmail(login.email);
        if (user.size() >= 1){
            String checkpass = user.get(0).getPassword();
        if (checkpass.equals(login.password)) {
            model.addAttribute(docSelect);
            return "doctors_info";
        }
        else {return "login_failure";}
    }

        else {return "login_failure";}
    }
    @GetMapping("/Signup")
    public String getSignup(Model model)
    {
        User user=new User();
        model.addAttribute(user);
        return "Signup_html";
    }
    @PostMapping("/postuserinfo")
    public String postsignup(User user,Model model) {
        if ((signup_request.emailCheck(user.email)) && (signup_request.passCheck(user.password, user.confirmPassword))) {
            user_repository.save(user);
            Login login=new Login();
            model.addAttribute(login);
            return "login_html";
        } else return "signup_failure";
    }


    @GetMapping("/doctors_info")
    public String getDocinfo(Model model){
        DocSelect docSelect=new DocSelect();
        model.addAttribute(docSelect);
        return "doctors_info";
    }
    @PostMapping("/postdocinfo")
    public String postdocinfo(DocSelect docSelect,Model model) {

        System.out.println(docSelect.docID);
        List<Schedule> schedule = scheduleRepository.findByDID(docSelect.docID);
        String checkpass = schedule.get(0).getSlot();
        String confirmslot = "";
        int count = 0;
        for (int i = 0; i < schedule.size(); i++) {
            String checkslot = schedule.get(i).getSlot();
            String checkstatus = schedule.get(i).getStatus();
            if (checkstatus.equals("available")) {
                count++;
                confirmslot = checkslot;
                int update=updateScheduleRepository.UpdateStatus(confirmslot,docSelect.docID);

                i = schedule.size() + 1;

            }
            else {
                count=0;
            }

        }


        System.out.println(confirmslot);
        String comfirmSlotPass=confirmslot+",Tomorrow";
        model.addAttribute("slotPass",comfirmSlotPass);

        return "scheduleConfirm";
    }


    @GetMapping("/confirmation")
    public String getConfirmation(){
        return "paymentConfirmation";
    }
    @GetMapping("/consentform")
    public String getConsent(Model model){
        Consent consent=new Consent();
        model.addAttribute(consent);
        return "consent_html";
    }
    @PostMapping("/postconsent")
    public String postconsent(Consent consent,Model model){
        consent_repusitory.save(consent);
        Payment payment=new Payment();
        model.addAttribute(payment);
        return "pay_html";

    }
    @GetMapping("/paymentpage")
    public String getPayment(Model model){
        Payment payment=new Payment();
        model.addAttribute(payment);
        return "pay_html";
    }
    @PostMapping("/postpaymentinfo")
    public String postpayment(Payment payment){
        payment_repository.save(payment);
        return "paymentConfirmation";
    }
}
