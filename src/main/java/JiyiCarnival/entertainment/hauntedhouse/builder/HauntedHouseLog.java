package JiyiCarnival.entertainment.hauntedhouse.builder;

import JiyiCarnival.Output;

public class HauntedHouseLog {
        private final String theFirstPart;
        private final String theSecondPart;
        private final String theThirdPart;

        /**
         * @param first  第一段路段
         * @param second 第二路段
         * @param third  第三路段
         */
        public HauntedHouseLog(String first, String second, String third)
        {
            theFirstPart = first;
            theSecondPart = second;
            theThirdPart = third;
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "规划出由" + theFirstPart + "的第一路段、" + theSecondPart + "的第二路段、" + theThirdPart + "的第三路段组成的鬼屋路线"
        );
//            System.out.println("第一条鬼屋路线包括" + theFirstPart + "的第一路段、" + theSecondPart + "的第二路段、" + theThirdPart + "的第三路段");
        }

        /**
         * 展示路线
         */
        public void play()
        {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "游玩了由" + theFirstPart + "的第一路段、" + theSecondPart + "的第二路段、" + theThirdPart + "的第三路段组成的鬼屋路线"
        );
//            System.out.println("您进入了由" + theFirstPart + "的第一路段、" + theSecondPart + "的第二路段、" + theThirdPart + "的第三路段组成的鬼屋路线");
        }
}
