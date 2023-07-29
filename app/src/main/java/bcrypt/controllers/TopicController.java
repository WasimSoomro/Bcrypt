package bcrypt.controllers;

@Controller

public class TopicController {

    @GetMapping("/Topics")
    public String getTopics(HttpServletRequest request, Model model) {
            HttpSession session = request.getSession();
            Object userNameAttribute = session.getAttribute("userName");
            if(userNameAttribute == null) {
                return  "redirect:/";
    }
    return "recipes.html";
        }
    }
