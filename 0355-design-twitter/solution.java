class Tweet implements Comparable<Tweet>{
    int time,tweetId;
    public Tweet(int time,int tweetId){
        this.time =time;
        this.tweetId=tweetId;
    }
    public int compareTo(Tweet tweets){
        return tweets.time - this.time;
    }
}

class Twitter {
    int time=0;
    private Map<Integer,List<Tweet>> usersMap = new HashMap<>();
    private Map<Integer,Set<Integer>> userFollowers = new HashMap<>();

    public void postTweet(int userId, int tweetId) {
        List<Tweet> tweets= usersMap.getOrDefault(userId,new ArrayList<>());
        tweets.add(new Tweet(++time,tweetId));
        usersMap.put(userId,tweets);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Tweet> allTweets = new ArrayList<>();
        Set<Integer> followers = userFollowers.getOrDefault(userId,new HashSet<>());
        followers.add(userId);
        
        for(int user:followers){
            allTweets.addAll(usersMap.getOrDefault(user,new ArrayList<>()));
        }

        Collections.sort(allTweets);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<Math.min(10,allTweets.size());i++){
            res.add(allTweets.get(i).tweetId);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {

        Set<Integer> addFollowers = userFollowers.getOrDefault(followerId,new HashSet<>());
        addFollowers.add(followeeId);
        userFollowers.put(followerId,addFollowers);
    
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(userFollowers.containsKey(followerId)){
            Set<Integer> followers = userFollowers.get(followerId);
            followers.remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
