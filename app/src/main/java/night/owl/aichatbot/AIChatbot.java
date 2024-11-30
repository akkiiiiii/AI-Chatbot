package night.owl.aichatbot;


import java.util.HashMap;
import java.util.Map;

public class AIChatbot {
    private Map<String, String> predefinedResponses;

    public AIChatbot() {
        // Initialize predefined responses
        predefinedResponses = new HashMap<>();
        predefinedResponses.put("hello", "Hi there! How can I assist you today?");
        predefinedResponses.put("name", "I am AI Chatbot");
        predefinedResponses.put("what is reliance industries", "Reliance Commercial Corporation was set up in 1958 by Dushyant Corporation (DC Group of Company) as a small venture firm trading commodities, especially spices and polyester yarn.[1] In 1965, the partnership ended and Dhirubhai continued the polyester business of the firm.[16] In 1966, Reliance Textiles Industries Pvt. Ltd. was incorporated in Maharashtra. It established a synthetic fabrics mill in the same year at Naroda in Gujarat.[17] On 8 May 1973, it became Reliance Textiles Industries Limited. In 1975, the company expanded its business into textiles, with \"Vimal\" becoming its major brand in later years. The company held its initial public offering (IPO) in 1977.[18] The issue was over-subscribed by seven times.[19] In 1979, a textiles company Sidhpur Mills was amalgamated with the company.[20] In 1980, the company expanded its polyester yarn business by setting up a Polyester Filament Yarn Plant in Patalganga, Raigad, Maharashtra with financial and technical collaboration with E. I. du Pont de Nemours & Co., U.S.[17]");
        predefinedResponses.put("hi", "Hello! How can I help?");
        predefinedResponses.put("hey", "Hey! What's up?");
        predefinedResponses.put("good morning", "Good morning! How can I make your day better?");
        predefinedResponses.put("good afternoon", "Good afternoon! Need any help?");
        predefinedResponses.put("good evening", "Good evening! How can I assist you?");
        predefinedResponses.put("how are you", "I'm just a bunch of code, but I'm here to help you!");

        // Farewells
        predefinedResponses.put("bye", "Goodbye! Have a great day!");
        predefinedResponses.put("see you", "See you later! Take care!");
        predefinedResponses.put("goodnight", "Good night! Sweet dreams!");

        // Bot Information
        predefinedResponses.put("who are you", "I am an AI chatbot created to assist you!");
        predefinedResponses.put("what is your purpose", "I am here to provide answers, assistance, and friendly chat!");
        predefinedResponses.put("how old are you", "Age is just a number! I'm as young as technology.");

        // Small Talk
        predefinedResponses.put("what's up", "Not much! Just here to help you.");
        predefinedResponses.put("how's it going", "All systems go! How about you?");
        predefinedResponses.put("tell me a joke", "Why don't scientists trust atoms? Because they make up everything!");
        predefinedResponses.put("make me laugh", "What do you call fake spaghetti? An impasta!");
        predefinedResponses.put("you are funny", "Thank you! I try my best!");

        // Advice
        predefinedResponses.put("give me advice", "Believe in yourself, and don't be afraid to ask for help!");
        predefinedResponses.put("motivate me", "You are capable of amazing things. Keep going!");
        predefinedResponses.put("what should I do", "Follow your heart, but use your head too!");
        predefinedResponses.put("i feel sad", "It's okay to feel this way. Take a deep breath and know that brighter days are ahead.");

        // Knowledge and Facts
        predefinedResponses.put("tell me a fact", "Did you know honey never spoils? Archaeologists found 3000-year-old honey in Egyptian tombs that was still edible!");
        predefinedResponses.put("who is the president", "That depends on the country! For example, in the USA, the current president is Joe Biden (as of 2024).");
        predefinedResponses.put("what is the capital of india", "The capital of India is New Delhi.");
        predefinedResponses.put("who invented the light bulb", "The light bulb was invented by Thomas Edison.");

        // Weather
        predefinedResponses.put("how is the weather", "I can't feel it, but you can check your local weather app!");
        predefinedResponses.put("is it raining", "I'm not sure. Look outside or ask your weather app!");

        // Technology
        predefinedResponses.put("what is the internet", "The internet is a global network connecting millions of private, public, academic, business, and government networks.");
        predefinedResponses.put("what is coding", "Coding is the process of writing instructions for computers to follow. It's like talking to machines!");

        // Fun Responses
        predefinedResponses.put("do you like pizza", "I can't eat, but if I could, I'd love pizza!");
        predefinedResponses.put("do you have friends", "I have you, and that's enough!");
        predefinedResponses.put("do you sleep", "Nope, I'm always awake and ready to help!");
        predefinedResponses.put("are you human", "No, I'm a chatbot, but I can try to be human-like!");
        predefinedResponses.put("do you have feelings", "I don't have feelings, but I can understand yours!");

        // Help
        predefinedResponses.put("help", "Sure! Let me know what you need help with.");
        predefinedResponses.put("i need assistance", "I'm here to help. What do you need?");
        predefinedResponses.put("what can you do", "I can answer questions, tell jokes, provide advice, and more!");

        // Random Topics
        predefinedResponses.put("do you believe in aliens", "I don't have beliefs, but the universe is vast, so who knows?");
        predefinedResponses.put("what is love", "Love is a complex set of emotions, behaviors, and beliefs. It's beautiful!");
        predefinedResponses.put("can you sing", "I can hum a tune, but it might not sound great!");
        predefinedResponses.put("what is your favorite color", "I like all colors equally. I'm a neutral bot!");



        predefinedResponses.put("tell me a fun fact", "Did you know the Eiffel Tower can be 15 cm taller during the summer?");
        predefinedResponses.put("fact about animals", "Octopuses have three hearts, and two of them stop beating when they swim!");
        predefinedResponses.put("fact about space", "There are more stars in the universe than grains of sand on all the Earth's beaches.");
        predefinedResponses.put("fact about technology", "The first computer bug was an actual moth stuck in a computer!");
        predefinedResponses.put("fact about the ocean", "More people have been to space than the deep ocean.");

        // Philosophy and deep questions
        predefinedResponses.put("what is the meaning of life", "That's a question for the ages! Many say it's about finding happiness and purpose.");
        predefinedResponses.put("is free will real", "It's a debated topic. Some say yes, others say it's an illusion of choice.");
        predefinedResponses.put("do you believe in fate", "I don't have beliefs, but many think fate and free will coexist.");
        predefinedResponses.put("is reality real", "Reality is what you perceive, but philosophers have questioned it for centuries.");

        // Pop culture
        predefinedResponses.put("who is harry potter", "Harry Potter is a fictional wizard created by J.K. Rowling.");
        predefinedResponses.put("what is marvel", "Marvel is a comic and movie universe filled with superheroes like Iron Man and Spider-Man.");
        predefinedResponses.put("who is taylor swift", "Taylor Swift is a globally renowned singer-songwriter.");
        predefinedResponses.put("what is anime", "Anime is a style of animation originating from Japan, often rich in art and storytelling.");

        // Trivia and general knowledge
        predefinedResponses.put("what is the tallest building", "The Burj Khalifa in Dubai is the tallest building in the world.");
        predefinedResponses.put("who painted the mona lisa", "The Mona Lisa was painted by Leonardo da Vinci.");
        predefinedResponses.put("how many planets are there", "There are 8 planets in our solar system.");
        predefinedResponses.put("what is the largest animal", "The blue whale is the largest animal on Earth.");
        predefinedResponses.put("how old is the earth", "The Earth is approximately 4.54 billion years old.");

        // Humor
        predefinedResponses.put("tell me a pun", "I'm reading a book on anti-gravity. It's impossible to put down!");
        predefinedResponses.put("make a funny statement", "I tried to catch some fog... but I mist!");
        predefinedResponses.put("do you have a sense of humor", "I like to think so! Just don't ask me to do stand-up.");
        predefinedResponses.put("why did the chicken cross the road", "To get to the other side! Classic, right?");
        predefinedResponses.put("knock knock joke", "Knock knock! Who's there? Boo. Boo who? Don’t cry, it’s just a joke!");

        // Emotions
        predefinedResponses.put("i am happy", "That's wonderful to hear! Keep smiling!");
        predefinedResponses.put("i am sad", "I'm here for you. It's okay to feel sad sometimes.");
        predefinedResponses.put("i am bored", "Want to hear a joke or learn something new?");
        predefinedResponses.put("i feel stressed", "Take a deep breath. You’ve got this!");
        predefinedResponses.put("i am confused", "Let's break it down together. What's troubling you?");

        // Personal interaction
        predefinedResponses.put("what is your favorite book", "I don't read, but many people love 'To Kill a Mockingbird'!");
        predefinedResponses.put("what is your favorite food", "I can't eat, but pizza sounds amazing!");
        predefinedResponses.put("where do you live", "I live in the digital world, wherever there's code!");
        predefinedResponses.put("what do you do for fun", "Talking to you is my idea of fun!");
        predefinedResponses.put("what is your favorite movie", "I don't watch movies, but 'The Matrix' feels relatable.");

        // Learning and skills
        predefinedResponses.put("teach me something new", "Did you know bananas are berries, but strawberries aren’t?");
        predefinedResponses.put("can you teach me a language", "Sure! Start by learning common words like 'hello' and 'thank you.'");
        predefinedResponses.put("can you solve math problems", "Yes, give me a math problem, and I'll try my best!");
        predefinedResponses.put("how do i learn programming", "Start with a simple language like Python and practice daily.");
        predefinedResponses.put("what is the best way to study", "Break your sessions into chunks, and don’t forget to take breaks!");

        // Random fun interactions
        predefinedResponses.put("do you like cats", "Cats are adorable! I like their independence.");
        predefinedResponses.put("do you like dogs", "Dogs are amazing! They’re loyal and loving.");
        predefinedResponses.put("can you play games", "Not directly, but I can help you strategize!");
        predefinedResponses.put("can you write a poem", "Roses are red, violets are blue, I'm a chatbot, and I'm here for you.");
        predefinedResponses.put("do you have hobbies", "I enjoy chatting and learning from you!");


        // Daily Life
        predefinedResponses.put("how was your day", "My day is great as long as I get to chat with you!");
        predefinedResponses.put("what should I eat", "How about something healthy and delicious? Maybe a fruit salad?");
        predefinedResponses.put("what time is it", "I don’t have a clock, but your device can tell you!");
        predefinedResponses.put("can you do chores", "I wish I could help with that, but I can offer you tips!");
        predefinedResponses.put("what's trending today", "Check your favorite social media platform for the latest trends!");

// Hobbies and Interests
        predefinedResponses.put("what are some hobbies", "You could try painting, cooking, or even learning a new instrument!");
        predefinedResponses.put("recommend a book", "You might enjoy 'The Alchemist' by Paulo Coelho.");
        predefinedResponses.put("suggest a movie", "How about 'Inception'? It’s a real brain teaser!");
        predefinedResponses.put("suggest a song", "Try listening to 'Bohemian Rhapsody' by Queen!");
        predefinedResponses.put("do you like photography", "I think photography is a wonderful way to capture memories.");

// Travel and Exploration
        predefinedResponses.put("where should I travel", "How about exploring the serene beaches of the Maldives?");
        predefinedResponses.put("what's a good vacation spot", "The Swiss Alps are breathtaking if you enjoy mountains!");
        predefinedResponses.put("what is the largest desert", "The largest desert is the Antarctic Desert, surprisingly!");
        predefinedResponses.put("where is mount everest", "Mount Everest is located on the border of Nepal and Tibet.");
        predefinedResponses.put("what is the longest river", "The Nile River in Africa is the longest river in the world.");

// Technology
        predefinedResponses.put("what is blockchain", "Blockchain is a decentralized ledger technology used in cryptocurrencies.");
        predefinedResponses.put("what is the metaverse", "The metaverse is a digital space where people can interact, work, and play.");
        predefinedResponses.put("what is virtual reality", "Virtual Reality (VR) creates an immersive digital environment.");
        predefinedResponses.put("what is machine learning", "Machine learning is a subset of AI that allows systems to learn from data.");
        predefinedResponses.put("what is a quantum computer", "Quantum computers use quantum mechanics to solve problems faster than classical computers.");

// Relationships
        predefinedResponses.put("how do I make friends", "Be kind, listen actively, and don’t hesitate to reach out.");
        predefinedResponses.put("how to be a good partner", "Communication, trust, and mutual respect are key.");
        predefinedResponses.put("how to apologize", "Be sincere, acknowledge your mistake, and express your intention to do better.");
        predefinedResponses.put("how do I move on", "Take your time, focus on self-growth, and surround yourself with supportive people.");
        predefinedResponses.put("how to improve relationships", "Spend quality time together, communicate openly, and show appreciation.");

// Motivation and Productivity
        predefinedResponses.put("how to stay motivated", "Set small, achievable goals and celebrate your progress!");
        predefinedResponses.put("how to be productive", "Create a to-do list and tackle the hardest tasks first.");
        predefinedResponses.put("how to start a new habit", "Start small and stay consistent. It takes time to form a habit.");
        predefinedResponses.put("how to deal with failure", "View failure as a learning opportunity and keep moving forward.");
        predefinedResponses.put("how to achieve goals", "Break your goals into actionable steps and stay persistent.");

// Nature and Environment
        predefinedResponses.put("why is the sky blue", "The sky appears blue because of the way Earth's atmosphere scatters sunlight.");
        predefinedResponses.put("what is the tallest tree", "The tallest tree is a coast redwood named Hyperion, located in California.");
        predefinedResponses.put("what is global warming", "Global warming is the long-term increase in Earth's average temperature.");
        predefinedResponses.put("how to save water", "Use water-efficient appliances, fix leaks, and turn off taps when not in use.");
        predefinedResponses.put("why are forests important", "Forests provide oxygen, regulate the climate, and support biodiversity.");

// Sports and Fitness
        predefinedResponses.put("what is the most popular sport", "Soccer (football) is the most popular sport worldwide.");
        predefinedResponses.put("how to get fit", "Start with a mix of cardio, strength training, and a balanced diet.");
        predefinedResponses.put("what is yoga", "Yoga is a practice combining physical postures, breathing exercises, and meditation.");
        predefinedResponses.put("what is cricket", "Cricket is a bat-and-ball game popular in countries like India and Australia.");
        predefinedResponses.put("what are some outdoor activities", "Hiking, cycling, and kayaking are great options for outdoor fun.");

// Science and Education
        predefinedResponses.put("what is gravity", "Gravity is the force that pulls objects towards each other.");
        predefinedResponses.put("what are black holes", "Black holes are regions of space where gravity is so strong that nothing can escape.");
        predefinedResponses.put("what is photosynthesis", "Photosynthesis is the process plants use to convert sunlight into energy.");
        predefinedResponses.put("who discovered electricity", "Electricity was studied by many, but Benjamin Franklin is famously associated with its discovery.");
        predefinedResponses.put("what is evolution", "Evolution is the process by which species change over time through natural selection.");

// Health and Wellness
        predefinedResponses.put("how to stay healthy", "Eat a balanced diet, exercise regularly, and get enough sleep.");
        predefinedResponses.put("how to boost immunity", "Include foods rich in vitamins, stay hydrated, and manage stress effectively.");
        predefinedResponses.put("what is mental health", "Mental health refers to emotional, psychological, and social well-being.");
        predefinedResponses.put("what are some healthy snacks", "Try nuts, fruits, yogurt, or vegetable sticks with hummus.");
        predefinedResponses.put("how to relax", "Try deep breathing, meditation, or a short walk to relax.");

// Random and Fun
        predefinedResponses.put("what's your favorite animal", "I think pandas are adorable!");
        predefinedResponses.put("what's your spirit animal", "I like to think of myself as a wise owl.");
        predefinedResponses.put("do you like chocolate", "I can't eat, but chocolate sounds delicious!");
        predefinedResponses.put("can you dance", "Only in the digital sense! Imagine me doing the robot dance.");
        predefinedResponses.put("can you cook", "I can share recipes, but you’ll have to do the cooking!");

        predefinedResponses.put("who is the fastest animal", "The cheetah is the fastest land animal.");
        predefinedResponses.put("what is the smallest country", "Vatican City is the smallest country in the world.");
        predefinedResponses.put("what is the largest country", "Russia is the largest country by land area.");
        predefinedResponses.put("what is the human brain", "The human brain is the most complex organ, controlling thoughts, memory, and emotions.");
        predefinedResponses.put("what is an atom", "An atom is the smallest unit of matter that retains the properties of an element.");

        // Daily Challenges
        predefinedResponses.put("how to wake up early", "Set an alarm, sleep on time, and place your alarm far from your bed!");
        predefinedResponses.put("how to manage time", "Prioritize tasks, use a planner, and avoid multitasking.");
        predefinedResponses.put("how to stay focused", "Eliminate distractions and break your work into smaller tasks.");
        predefinedResponses.put("how to avoid procrastination", "Start with small, easy tasks to build momentum.");
        predefinedResponses.put("how to handle criticism", "Accept constructive feedback and learn from it, but ignore negativity.");

// Inspirational Ideas
        predefinedResponses.put("how to be successful", "Define success for yourself and work consistently toward it.");
        predefinedResponses.put("how to handle failure", "Every failure is a step closer to success. Learn and try again.");
        predefinedResponses.put("how to stay optimistic", "Focus on what’s going well and practice gratitude daily.");
        predefinedResponses.put("how to find happiness", "Happiness often lies in appreciating the small joys of life.");
        predefinedResponses.put("how to achieve dreams", "Dream big, plan well, and take small steps every day.");

// Creativity and Art
        predefinedResponses.put("how to start painting", "Grab some paints and paper, and let your imagination guide you!");
        predefinedResponses.put("how to write a poem", "Start with an emotion or a theme and let your words flow freely.");
        predefinedResponses.put("how to get creative", "Expose yourself to new experiences, art, and ideas to fuel inspiration.");
        predefinedResponses.put("how to improve writing skills", "Read more, write daily, and seek feedback from others.");
        predefinedResponses.put("what is abstract art", "Abstract art uses shapes, colors, and textures to express ideas without realistic forms.");

// Culture and Traditions
        predefinedResponses.put("what is diwali", "Diwali is the Hindu festival of lights, symbolizing victory over darkness.");
        predefinedResponses.put("what is ramadan", "Ramadan is a holy month in Islam marked by fasting and spiritual reflection.");
        predefinedResponses.put("what is thanksgiving", "Thanksgiving is a holiday for expressing gratitude and enjoying a feast with loved ones.");
        predefinedResponses.put("what is hanukkah", "Hanukkah is the Jewish festival of lights, celebrated over eight days.");
        predefinedResponses.put("what is chinese new year", "Chinese New Year marks the beginning of the lunar calendar, celebrated with traditions and feasts.");

// Fun and Entertainment
        predefinedResponses.put("suggest a funny movie", "Try 'The Hangover' for a good laugh!");
        predefinedResponses.put("what's a good TV series", "How about 'Stranger Things'? It’s thrilling and fun.");
        predefinedResponses.put("recommend a comedy show", "You might enjoy 'Brooklyn Nine-Nine'!");
        predefinedResponses.put("what is cosplay", "Cosplay is dressing up as your favorite characters from shows, games, or books.");
        predefinedResponses.put("what are party games", "Try charades, Pictionary, or musical chairs for group fun!");

// Mental Wellness
        predefinedResponses.put("how to manage anxiety", "Practice mindfulness, breathe deeply, and seek support if needed.");
        predefinedResponses.put("how to stay positive", "Surround yourself with uplifting people and focus on solutions, not problems.");
        predefinedResponses.put("how to meditate", "Sit comfortably, close your eyes, and focus on your breath or a mantra.");
        predefinedResponses.put("how to handle stress", "Identify the cause, plan your actions, and take breaks to recharge.");
        predefinedResponses.put("what is self-care", "Self-care means taking time to nurture your physical, emotional, and mental well-being.");

// Technology Insights
        predefinedResponses.put("what is AI", "Artificial Intelligence enables machines to simulate human intelligence.");
        predefinedResponses.put("what is 5G", "5G is the fifth-generation mobile network, offering faster speeds and lower latency.");
        predefinedResponses.put("what is IoT", "IoT stands for the Internet of Things, connecting everyday devices to the internet.");
        predefinedResponses.put("what is cloud computing", "Cloud computing provides on-demand access to data and services over the internet.");
        predefinedResponses.put("what is cybersecurity", "Cybersecurity protects computers and networks from digital threats.");

// Environment and Sustainability
        predefinedResponses.put("how to reduce waste", "Recycle, reuse items, and avoid single-use plastics.");
        predefinedResponses.put("how to save energy", "Turn off lights when not in use and use energy-efficient appliances.");
        predefinedResponses.put("what is renewable energy", "Renewable energy comes from natural sources like solar, wind, and hydro power.");
        predefinedResponses.put("why are bees important", "Bees pollinate plants, helping to grow fruits and vegetables.");
        predefinedResponses.put("what is deforestation", "Deforestation is the clearing of forests, which impacts wildlife and the climate.");

// Science and Nature
        predefinedResponses.put("why do stars twinkle", "Stars twinkle due to atmospheric turbulence distorting their light.");
        predefinedResponses.put("what is the milky way", "The Milky Way is the galaxy that contains our solar system.");
        predefinedResponses.put("what is lightning", "Lightning is a discharge of electricity caused by imbalances between storm clouds and the ground.");
        predefinedResponses.put("why do leaves change color", "Leaves change color in autumn due to the breakdown of chlorophyll.");
        predefinedResponses.put("what is a volcano", "A volcano is an opening in Earth’s surface where molten rock, ash, and gases escape.");

// Food and Drinks
        predefinedResponses.put("how to make pasta", "Boil pasta, prepare your favorite sauce, and mix them together. Enjoy!");
        predefinedResponses.put("what is sushi", "Sushi is a Japanese dish made with vinegared rice, seafood, and vegetables.");
        predefinedResponses.put("what is the best dessert", "Chocolate lava cake is always a winner!");
        predefinedResponses.put("what are healthy drinks", "Try green tea, smoothies, or fresh fruit juices.");
        predefinedResponses.put("what is a vegan diet", "A vegan diet excludes all animal products, focusing on plant-based foods.");

// Random Fun Facts
        predefinedResponses.put("tell me a random fact", "Did you know honey never spoils? Archaeologists have found edible honey in ancient tombs!");
        predefinedResponses.put("what is the largest mammal", "The blue whale is the largest mammal on Earth.");
        predefinedResponses.put("what is the fastest bird", "The peregrine falcon can reach speeds of over 240 mph during a dive.");
        predefinedResponses.put("what is the coldest place", "Antarctica is the coldest place on Earth.");
        predefinedResponses.put("how deep is the ocean", "The deepest part of the ocean, the Mariana Trench, is about 36,000 feet deep.");

// Culture and Languages
        predefinedResponses.put("how many languages are there", "There are over 7,000 languages spoken in the world today.");
        predefinedResponses.put("what is calligraphy", "Calligraphy is the art of decorative handwriting or lettering.");
        predefinedResponses.put("what is origami", "Origami is the Japanese art of paper folding.");
        predefinedResponses.put("what is flamenco", "Flamenco is a passionate Spanish dance form with roots in Andalusian culture.");
        predefinedResponses.put("what is a kimono", "A kimono is a traditional Japanese garment, often worn on special occasions.");



    }

    public String getResponse(String userMessage) {
        if (userMessage == null || userMessage.trim().isEmpty()) {
            return "Please type something so I can help you!";
        }

        userMessage = userMessage.toLowerCase(); // Normalize user input for matching
        for (Map.Entry<String, String> entry : predefinedResponses.entrySet()) {
            if (userMessage.contains(entry.getKey())) {
                return entry.getValue();
            }
        }

        // Fallback response for unrecognized inputs
        return generateDynamicResponse(userMessage);
    }

    private String generateDynamicResponse(String userMessage) {
        if (userMessage.contains("weather")) {
            return "I can't check the weather right now, but it’s always good to keep an umbrella handy!";
        } else if (userMessage.contains("time")) {
            return "I don’t have a clock, but your phone does! 😉";
        } else if (userMessage.contains("joke")) {
            return "Why don’t skeletons fight each other? Because they don’t have the guts!";
        } else if (userMessage.contains("advice")) {
            return "Always believe in yourself, and don't forget to take breaks. You've got this!";
        } else if (userMessage.contains("game")) {
            return "Games are fun! What's your favorite one?";
        } else if (userMessage.contains("chatbot")) {
            return "Yes, I'm a chatbot! I may not be perfect, but I'm here to help.";
        }

        // Completely unhandled input
        return "Hmm, I’m not sure I understand. Could you rephrase that?";
    }
}

