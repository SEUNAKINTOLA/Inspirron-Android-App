package com.example.akintolaoluwaseun.inspirron;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by AKINTOLA OLUWASEUN on 7/8/2015.
 */
public class short_info extends AppCompatActivity {

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private ViewFlipper mViewFlipper;
    private Animation.AnimationListener mAnimationListener;
    private Context mContext;



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("deprecation")
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.short_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });




        final String erik =
                "The rural Idaho native, at age 15 is the  founder of Botangle.com, which offers tutoring over video chat services for teens who, like him, wanted more than the limited education opportunities within physical reach. To fund the site, Finman two years ago invested a $1,000 gift in Bitcoin, then an unlikely digital currency; soon it spiked in value, and he had $100,000. It’s no wonder, then,that Finman says he struck a deal with his parents: if he makes $1 million before he turns 18, he won’t have to attend college"
        ;


        final String wiston =
                "Winston Churchill was born at Blenheim Palace Woodstock near Oxford toan aristocratic family – The Dukes of Marlborough. He was brought up by servants and friends of the family. He rarely spoke to his father and his mother rarely saw him when at boarding school. Churchill went to Harrow chool, he wasn’t the best student; having a rebellious nature and slow to learn, but he excelled at sports and joined the Officer Cadet Corps which he enjoyed. On leaving school, he went to Sandhurst to train as an officer. After gaining his commission, he sought to gain as much active military experience as possible, he used his mother’s connections to Cuba and North India. He also combined his military duties with working as a war correspondent; earning substantial money for his career as a war correspondent. He was in South Africa for the Boer war, and he became a minor celebrity for his role in taking part in a scouting patrol; getting captures and later escaping. In 1911, he was made first Lord of the Admiralty – a post he held into the first World War. After the second World War, he was shocked to lose the 1945 general election to a resurgent Labor Party. But he returned to Power in the 1950 election. He was awarded the Nobel Prize inliterature in 1953, for his mastery of historical and biographical description as well as for brilliant oratory in defending exalted human values. He died in this home at age 80. His funeral was the largest state funeral in the world; up to that point in time. Food For Thought: There are two kinds of education, the one that teaches us how to live and the one that teaches us how to earn a living. Wiston wasn’t good at the latter yet he knew how to live. Even though he wasn’t too brilliant, yet he concentrated on his inner stenght and focused on both his writing and oratory skills His talent, not his certificate or grade in school, brought him to lime light. I think that’s a good lesson to learn from him.\n Reference:(The Scribes)\n"
;

        final String larry =
                " Larry Page was born on 26th March 1973 in East Lansing, Michigan. Both his parents were experts in computers and following his parents line of interest, Page graduated from the University of Michigan with Bachelor of Science in computer engineering and Master of Science from Stanford University. He was interested in computers from an early age and he wanted to start his own company from age 12. He was" +
                        " the first child in his school to do an assignment on word processor. It was during his time in Stanford when the first seeds of this brilliant thought were planted.\n" +
                        "\n" +
                        "After he entered the PhD program, he had to decide on a dissertation theme. This was when he came up with the " +
                        "idea that would link together web pages, like a citation links to a reference. He was joined with college friend " +
                        "and fellow PhD student Sergey Brin, who found this topic to be very appealing. The project was initially named ‘Backrub’. Both started working on this huge task of building a crawler that would convert backlink data into a degree of how important a web page was. Consequently, PageRank algorithm was created that made the duo realize that they could make a search engine far greater to the ones that were currently in use. The first version of Google came out in 1996 and it is still available on the Stanford University’s website.\n" +
                        "\n" +
                        "Google Inc. was founded in 1998 with Larry Page and Sergey Brin as co-presidents. Its initial domain name was" +
                        " ‘Googol’ which was derived from a number that is one followed by hundred zeros. This represented the vast amount" +
                        " of data that the search engine was intended to explore. They stated their mission as ‘to organize the world’s information" +
                        " and make it universally accessible and useful. With a humble beginning from Page’s garage the company expanded to own few " +
                        "offices in California in 1999 and then an entire complex called ‘Googleplex’, that is of the most extraordinary workplaces of " +
                        "the world comprising of amazing recreational and exercising facilities. By 2001 Google was growing with a fiery speediness and " +
                        "making big profits. The company’s first public offering was $1.67 billion which gave it a market capitalization of $23 billion." +
                        " Page became a multi billionaire at just 27. As a favorite of shareholders, Google’s stock prices rose immensely. Page received " +
                        "the Academy of Achievement’s ‘Golden Plate Award’ in 2004.\n" +
                        "\n" +
                        "By 2006, Google consisted of more than 10,000 employees with annual incomes of over ten billion dollars. Google bought several " +
                        "hardware and software companies out of which the most profitable was the purchase of YouTube for 1.65 billion dollars. Today, " +
                        "Google is one of the most used website with over a million servers worldwide. It processes more than a billion search requests " +
                        "every day.\n" +
                        "\n" +
                        "Larry Page is one of the most successful entrepreneurs who laid the foundation for a venture that has changed the way in which " +
                        "internet was used."
        ;




        final String eden =
                "Eden Full was still in high school when she started" +
                        " developing the SunSaluter, a solar panel that rotates with the " +
                        "movement of the sun to maximize efficiency. It’s tracking mechanism uses" +
                        " thermal expansion instead of an electric motor, making it relatively low maintenance and low cost." +
                        "Making the prototype better would require her full attention and more money, so Full " +
                        "applied for the $100,000 Thiel " +
                        "Scholarship and won in May 2012. " +
                        "Full took a year off school to further " +
                        "develop the SunSaluter and the company" +
                        " she’s built around it." +
                        "To date, Eden Full has helped over 6,000 people get clean water and power." +
                        " She returned to Princeton to study Mechanical Engineering in Fall 2013"
        ;




        final String sho =
                "Sho Yano - Scored 1500 on the SAT at age 8, began" +
                "attending Loyola University  Chicago at age 9, receiving his B.S. at age 12. He then " +
                " began medical school at the University of Chicago. He was awarded his PhD in molecular" +
               " genetics at the age of 18.\n"
        ;
        final String walt =
                "Walter Elias ‘Walt Disney’ laid the foundations of a magical, optimistic and whimsical world full of imagination many decades ago that instantly won the audiences and the magic of his creation is still alive today.\n" +
                        "The American director, film producer, screenwriter, animator, voice actor, entertainer, philanthropist and a highly successful entrepreneur was born on 5th December 1901 in the Hermosa community of Chicago. His family moved to Marceline shortly after his birth where Walt spent most of his childhood. His early interest in art and drawing had him selling small sketches that used to do in his spare time. His activities always revolved around some kind of art work. He attended McKinley High School where he showed immense talent in drawing and photography. He also contributed his drawings to the school newspaper. To refine his art skills he joined the evening classes in the Academy of Arts.\n" +
                        "\n" +
                        "The Disney family moved to Kansas where Walt continued to flourish in his artistic talent. He also picked up a knack for performing and acting. In 1918 Walt joined the Red Cross and was sent to France for a year. He covered the ambulance that he drove with cartoons instead of stock camouflage. On his return Walt decided that he would pursue commercial art seriously and soon he was producing animated films for small businesses. At 21, he had started his company called ‘Laugh-O-Grams’ and the first animated film he began working on was called ‘The Alice Comedies’. The company went bankrupt before the film could be created however Walt was not one to give up. He packed his bags for Hollywood with a dream to achieve greatness. With the help of his brother Roy O. Disney, who was already in California, Walt managed to set up a shop. He got his very first order for ‘Alice in Cartoon land’ and from that there was no turning back. Walt was soon known amongst the elite of Hollywood, although he chose to lead a simple lifestyle.\n" +
                        "\n" +
                        "In 1928 Walt created one of his most legendary characters ‘Mickey Mouse’ who made his debut in world’s first sound cartoon in 1928 at the Colony Theater, New York. After the introduction of Technicolor to animated films, Disney held its patent for almost two years. In 1929, Walt created new friends for Mickey Mouse namely Minnie Mouse, Goofy, Pluto and Donald Duck. Walt’s journey to fame had started to get even better. He won his first Academy Award in 1932. His first full length animated movie ‘Snow White and the Seven Dwarfs’ came out in December 1937 which was produced at the unimaginable cost of $1,499,000 amidst the Depression. In the next five years Walt Disney Studios released more full length features such as Pinocchio, Dumbo, Fantasia and Bambi. More animated features followed in the 50’s including Cinderella (1950), Alice in Wonderland (1951), Peter Pan (1953), Sleeping Beauty (1959) and 101 Dalmatians (1961). Walt was the first one to use TV for entertainment purposes and his shows Davy Crockett, Mickey Mouse Club and Zorro were immensely popular.\n" +
                        "\n" +
                        "Walt had always wanted to start a theme park where children could enjoy with their families, take fun rides and see their favorite Disney characters. This dream became a reality in 1955 with the opening of Disney Land Park that entertains worldwide tourists. Walt planned another Disney Land which he could not see as the maker of the magical world died on 15th December 1966 due to lung cancer. His brother Roy completed the Walt Disney World which opened in 1971."
                ;






        final String brin =
                "American  computer scientist and entrepreneur Sergey Mikhaylovich Brin is the co-founder of Google, the largest internet company in the world. Brin was born in Russia in 1973 and his family suffered from financial trouble before arriving in America. They moved to the US when he was six years old to avoid the unfair persecution of Jews in Russia. Brin’s father wanted to be an astronomer but ended up as professor of mathematics at the University of Maryland (Sergey Brin’s alma mater) and his mother is a researcher at a NASA Space Center.\n" +
                        "After graduating from University of Maryland with honors in 1993, Brin began his graduate studies at Stanford in the field of computer science on a graduate fellowship he received from the National Science Foundation. Brin met Larry Page, the co-founder of their future company, during the orientation at Stanford. After a while they became close friends, especially since they were able to intellectually challenge each other.\n" +
                        "Brin’s area of interest was data mining and together with page, he co-authored a paper entitled “The Anatomy of a Large Scale Hypertextual Web Search Engine“. After putting their heads together, they began working on their theoretical project in earnest and bought a number of low priced computers which they would keep in their dormitory rooms. Using these computers, they began to build a search engine which quickly surpassed\n" +
                        " even Stanford’s computer search system. After working together for a while, in 1998 the pair decided to put their PhDs on hold in order to take their extraordinary idea to market.\n" +
                        "At that time they had no money for product development or establishing a company, so they borrowed from friends, family and professors. With the money they had collected, they rented out a garage in Menlo Park to set up their headquarters and bought some servers to begin working. They were in the process of filing the paperwork to incorporate their company but as yet their company had not been formally established. With another $100,000 from Andy Bechtolsheim (the co-founder of Sun Microsystems) the duo officially incorporated their company as “Google, Inc” which was named after the mathematical term “googol”.\n" +
                        "\n" +
                        "Ever since the incorporation of his company in 1998, Brin and Page have had unprecedented global success. Google Inc’s motto is Brin and Page’s combined vision and that is to make information universally accessible to everyone. Their contribution to enhancing the spread of global knowledge has been so great, that “The Economist” magazine even compared it to the modern equivalent of the invention of the mechanical printing press by Johannes Gutenberg. Google, Inc is now the largest Internet company in the world and Brin and Page own 16% of it.\n" +
                        "In 2007, Sergey Brin married a biotech analyst named Anne Wojcicki. Brin’s wife is actively interested in spreading health information and the couple co-founded a company named “23andMe” that is devoted to research about the human genome project. They have a son (born 2008) and a daughter (born 2011) but the couple separated in 2013. Brin’s mother is suffering from Parkinson’s disease and is being treated at the University of Maryland School of Medicine, to which Brin himself has made a donation. Brin and Page have won numerous awards and honors, including being named the fifth most powerful people in the world by Forbes magazine in 2009. As of March 2014, Brin is the 19th richest person in the world with a personal wealth of US $31.8 billion."
                ;
        final String alec =
                "Sixteen-year-old filmmaker and education activist Alec Urbach is using film to revolutionize elementary education in developing nations. He created a cartoon-animated curriculum that isn't language-dependent for illiterate children."
                ;
        final String mark =
                "The second youngest billionaire of the world and chief executive officer of Facebook, Mark Zuckerburg is truly an inspiration for future generation of entrepreneurs. Here is his story of great success that began in a dorm room and encompassed the world due to utter talent and brilliant mind work.\n" +
                        "Mark Zuckerburg, the man who owns world’s most sought after social networking website was born on 14th May 1984 in White Plains, New York to Edward Zuckerburg, a dentist and Karen, a psychiatrist. As a child prodigy, most of his time was spent with computers and creating software. He learned the ATARI basic programming from his father and later used it to make ‘ZuckNet’; a software that linked all the computers of his house and his father’s dental clinic by pinging. He had an outstanding mind even when he was little as quoted precisely by writer Jose Antonio Vargas “some kids played computer games. Mark created them”.\n" +
                        "When Mark was in high school he developed a music player that worked on artificial intelligence; the ‘Synapse Media Player’ could pick up its user’s listening habits. Microsoft and AOL were interested in purchasing this player but Zuckerburg refused and instead opted to enroll in Harvard University in 2002 where he studied computer science and psychology. While at Harvard he wrote various softwares namely ‘Facemash’, a program in which the students could vote who was better looking. This was shut down on the grounds of privacy protection and being totally ‘improper’. Zuckerburg dropped out of Harvard during his sophomore year to devote all his time and energy to the project that he had initiated.\n" +
                        "Facebook was born in Harvard and was initially just a university ‘thing’ but Mark wanted it to extend to other universities. From Dartmouth, Stanford to Cornell, Penn and Brown, Facebook started spreading rapidly. To follow his dream Mark moved to Palo Alto, California along with some close friends, where they laid the solid foundations of Facebook. After huge investments from Peter Thiel and venture capital firm ‘Accel Partners’, the social network was able to cross the boundaries of the ivy league schools. By December 2005 Facebook had almost 6 million users worldwide.\n" +
                        "Mark became the world’s youngest billionaire at the age of 24 and the 35th richest American. By 2010 Facebook users had increased to 500 million. Facebook debuted on the NASDAQ stock exchange at 38 dollars per share and a market capitalization of 104 billion dollars making it one of the largest companies in the Silicon Valley and the world.\n" +
                        "Mark’s thriving career faced many legal setbacks that included several lawsuits and claims regarding Facebook. Mark faced these with determination and although he had to pay heavy amounts of settlement money, none of the controversies affected his accomplishments.\n" +
                        "Chosen as the ‘Time’ person of the year in 2010, the billionaire never faltered due to any hurdle and continues to introduce innovations to his brainchild, the Facebook, which is continually becoming more popular with the passage of time.\n" +
                        "\n" +
                        "He is also very happy in his personal life having recently wed his long term girlfriend; Priscilla Chan. Mark is a generous donor to many charities. He has signed the ‘Giving Pledge’ an initiative that takes promises from the word’s billionaires to donate half of their wealth to charities during or after their life."
                ;
        final String akshay =
                "\n" +
                        "Indian-Australian Akshay Venkatesh distinguished himself at an early" +
                        " age. In 1993, when he was 11 years old, he won a bronze medal " +
                        "at the International Physics Olympiad in Virginia. Venkatesh chose to switch" +
                        " his focus to mathematics soon after taking home the bronze, and he went on to win two more Olympiad medals in the subject. He finished high school when he was only 13 and went to the University of Western Australia, graduating with first class honors in Mathematics in 1997 – the youngest student ever to do so.\n" +
                        "Even then, Venkatesh didn’t pause for a breath, and a PhD from Princeton University consummated his academic success. At only 20 years old and with a doctorate under his belt, the young scholar already had a solid position in the world of academia.\n"
                ;
        final String gates =
                "Bill Gates was born on October 28, 1955 in Seattle in a family having rich business, political and " +
                        "community service background.\n" +
                        "Bill believed in achieving his goals through hard work. He also believes that if you are intelligent and know how to use your intelligence, you can reach your goals and targets.\n" +
                        "Bill Gates and his friends were very much interested in computer and formed “Programmers Group” in late 1968 (13 years of age).\n" +
                        "Allen kept on pushing Bill for opening a new software company. Within a year, Bill Gates dropped out from Harvard. Then he formed Microsoft.\n" +
                        "His beliefs are so powerful, which have helped him increase his wealth and his monopoly in the industry.\n"
                ;
        final String holmes =
                "When Elizabeth Holmes was a 19-year-old sophomore at \n" +
                        "Stanford University, she decided to drop out and start her own company, “Theranos”. Holmes wanted to create a technology that would make blood tests easier. She hates needles, and wanted to make blood tests simpler, cheaper and more accessible for all people. For a decade, she quietly worked on a technology that would make blood tests nothing more than a painless finger prick.\n" +
                        "Holmes has created hardware and software that allow for blood tests to be done by pricking someone’s finger and storing the blood in a tiny vial called “A Nanotainer”. Holmes’ company, Theranos, is now worth $9 billion.\n"
                ;
        final String dean =
                "ean Kamen is an American entrepreneur, inventor and technology advocate, who is the president of DEKA Research & Development Corporation. Kamen was born on Long Island, New York in 1951. His father Jack Kamen was an illustrator for EC Comics. Kamen studied at the  Worcester Polytechnic Institute but did not stay behind to complete his degree. His first invention was a “wearable infusion pump” made when he was still a college undergraduate. This has been widely used in many medical fields such as chemotherapy, neonatology, and endocrinology. Kamen founded his own medical device manufacturing company by the name of “AutoSyringe, Inc.” This company would manufacture and market the pumps that Kamen had developed and was later sold to Baxter Healthcare Corporation.\n" +
                        "After selling his first company, Kamen founded another one by the name of DEKA Research & Development Corporation. The purpose of this company was to develop radical new technologies and provide research and development expertise for corporate clients. One of DEKA’s most successful inventions and supervised by Kamen includes “HomeChoice peritoneal dialysis system”. This was developed for Baxter International Inc. and is a system for performing dialysis at patients’ homes rather than necessarily at hospitals. This product quickly became the worldwide industry leader.\n" +
                        "Kamen’s best known invention is the “Segway PT” (Personal Transporter) – a battery powered mobility system used to transport people with disabilities. The device has an inbuilt stabilizing system so it is effectively self balancing. It has two wheels and can be controlled by shifting body weight. A similar invention is the iBOT, an all purpose electric wheelchair formed in partnership with Johnson and Johnson’s Independence Technology division. Kamen also developed a water purification system to help improve living standards in developing countries. Another device is a human launcher that pushes people high into the air – this allows emergency rescue and SWAT teams to access high rising, inaccessible buildings quickly and easily.\n" +
                        "amen has recently expanded the focus of his work and is not solely working towards the development of health care products. This includes using technology to solve the problems of pollution, electricity shortage and water contamination. Deka’s team of engineers is working towards the latter objective by trying to build a “nonpolluting engine”. This is being funded by millions of dollars of Kamen’s private capital.\n" +
                        "In 1989, Dean Kamen founded a non-profit organization by the name of FIRST, which stands for “For Inspiration and Recognition of Science and Technology”. This organization is devoted to the promotion of interest in the fields of science and technology, especially in children and teenagers. Kamen encourages children to pursue scientifically inclined careers such as engineering. FIRST sponsors scientific competitions in the U.S. as well as abroad. Kamen has won several honors and awards for his accomplishments so far. He was elected to the National Academy of Engineering, has received the Heinz Award in Technology, the Economy and Employment, National Medal of Technology from President Clinton and several others. TIME magazine lauded his invention of the “Slingshot” – a cheap, portable, water purification system. He has been inducted into the National Inventors’ hall of Fame. \n" +
                        "Dean Kamen is currently 63 years old and lives in a huge hexagonal mansion named “Westwind” in Bedford, New Hampshire. His house is built on four levels and equipped with fascinating things such as an observation tower, a steam engine that once belonged to Henry Ford, novelty vintage furniture, a secret passageway and a helicopter hangar (as he often commutes via helicopter). His exact net worth isn’t known but it is estimated to be in billions of dollars."
                ;




        final Button bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", bt.getText().toString());
                intent.putExtra("thetext2", erik.toString());
                startActivity(intent);
            }
        });
        final Button At = (Button) findViewById(R.id.buttonA);

        At.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", At.getText().toString());
                intent.putExtra("thetext2", wiston.toString());
                startActivity(intent);
            }
        });

        final Button ct = (Button) findViewById(R.id.button3);

        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ct.getText().toString());
                intent.putExtra("thetext2", larry.toString());
                startActivity(intent);
            }
        });

        final Button dt = (Button) findViewById(R.id.button4);

        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", dt.getText().toString());
                intent.putExtra("thetext2", eden.toString());
                startActivity(intent);
            }
        });

        final Button et = (Button) findViewById(R.id.button5);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", et.getText().toString());
                intent.putExtra("thetext2", sho.toString());
                startActivity(intent);
            }
        });

        final Button ft = (Button) findViewById(R.id.button6);

        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ft.getText().toString());
                intent.putExtra("thetext2", walt.toString());
                startActivity(intent);
            }
        });


        final Button gt = (Button) findViewById(R.id.button7);

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", gt.getText().toString());
                intent.putExtra("thetext2", brin.toString());
                startActivity(intent);
            }
        });


        final Button ht = (Button) findViewById(R.id.button8);

        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ht.getText().toString());
                intent.putExtra("thetext2", alec.toString());
                startActivity(intent);
            }
        });


        final Button it = (Button) findViewById(R.id.button9);

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", it.getText().toString());
                intent.putExtra("thetext2", mark.toString());
                startActivity(intent);
            }
        });


        final Button jt = (Button) findViewById(R.id.button10);

        jt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", jt.getText().toString());
                intent.putExtra("thetext2", akshay.toString());
                startActivity(intent);
            }
        });


        final Button kt = (Button) findViewById(R.id.button11);

        kt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", kt.getText().toString());
                intent.putExtra("thetext2", gates.toString());
                startActivity(intent);
            }
        });


        final Button lt = (Button) findViewById(R.id.button12);

        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", lt.getText().toString());
                intent.putExtra("thetext2", holmes.toString());
                startActivity(intent);
            }
        });






    }



    class SwipeGestureDetector extends SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                // right to left swipe
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

                    Intent intent = new Intent(short_info.this, long_info.class);

                    intent.putExtra("thetext", "aaaaaaaaa");
                    intent.putExtra("thetext2", "bbbbbbbb");
                    startActivity(intent);

                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_out));
                    // controlling animation
                    mViewFlipper.getInAnimation().setAnimationListener(mAnimationListener);
                    mViewFlipper.showNext();
                    return true;
                } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.right_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,R.anim.right_out));
                    // controlling animation
                    mViewFlipper.getInAnimation().setAnimationListener(mAnimationListener);
                    mViewFlipper.showPrevious();
                    return true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return false;
        }
    }
}
