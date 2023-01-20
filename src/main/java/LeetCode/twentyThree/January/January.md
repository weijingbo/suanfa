## 1.13每日一题
[2287 重排字符形成目标字符串](rearrangeCharacters.java)

给你两个下标从 0 开始的字符串 s 和 target 。你可以从 s 取出一些字符并将其重排，得到若干新的字符串。

从 s 中取出字符并重新排列，返回可以形成 target 的 最大 副本数。



      示例 1：
      
      输入：s = "ilovecodingonleetcode", target = "code"
      输出：2
      解释：
      对于 "code" 的第 1 个副本，选取下标为 4 、5 、6 和 7 的字符。
      对于 "code" 的第 2 个副本，选取下标为 17 、18 、19 和 20 的字符。
      形成的字符串分别是 "ecod" 和 "code" ，都可以重排为 "code" 。
      可以形成最多 2 个 "code" 的副本，所以返回 2 。
      示例 2：
      
      输入：s = "abcba", target = "abc"
      输出：1
      解释：
      选取下标为 0 、1 和 2 的字符，可以形成 "abc" 的 1 个副本。
      可以形成最多 1 个 "abc" 的副本，所以返回 1 。
      注意，尽管下标 3 和 4 分别有额外的 'a' 和 'b' ，但不能重用下标 2 处的 'c' ，所以无法形成 "abc" 的第 2 个副本。
      示例 3：
      
      输入：s = "abbaccaddaeea", target = "aaaaa"
      输出：1
      解释：
      选取下标为 0 、3 、6 、9 和 12 的字符，可以形成 "aaaaa" 的 1 个副本。
      可以形成最多 1 个 "aaaaa" 的副本，所以返回 1 。
      
      
      提示：
      
      1 <= s.length <= 100
      1 <= target.length <= 10
      s 和 target 由小写英文字母组成

## 1.20每日一题
[1817. 查找用户活跃分钟数](findingUsersActiveMinutes.java)

给你用户在 LeetCode 的操作日志，和一个整数 k 。日志用一个二维整数数组 logs 表示，其中每个 logs[i] = [IDi, timei] 表示 ID 为 IDi 的用户在 timei 分钟时执行了某个操作。

多个用户 可以同时执行操作，单个用户可以在同一分钟内执行 多个操作 。

指定用户的 用户活跃分钟数（user active minutes，UAM） 定义为用户对 LeetCode 执行操作的 唯一分钟数 。 即使一分钟内执行多个操作，也只能按一分钟计数。

请你统计用户活跃分钟数的分布情况，统计结果是一个长度为 k 且 下标从 1 开始计数 的数组 answer ，对于每个 j（1 <= j <= k），answer[j] 表示 用户活跃分钟数 等于 j 的用户数。

返回上面描述的答案数组 answer 。



      示例 1：
      
      输入：logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
      输出：[0,2,0,0,0]
      解释：
      ID=0 的用户执行操作的分钟分别是：5 、2 和 5 。因此，该用户的用户活跃分钟数为 2（分钟 5 只计数一次）
      ID=1 的用户执行操作的分钟分别是：2 和 3 。因此，该用户的用户活跃分钟数为 2
      2 个用户的用户活跃分钟数都是 2 ，answer[2] 为 2 ，其余 answer[j] 的值都是 0
      示例 2：
      
      输入：logs = [[1,1],[2,2],[2,3]], k = 4
      输出：[1,1,0,0]
      解释：
      ID=1 的用户仅在分钟 1 执行单个操作。因此，该用户的用户活跃分钟数为 1
      ID=2 的用户执行操作的分钟分别是：2 和 3 。因此，该用户的用户活跃分钟数为 2
      1 个用户的用户活跃分钟数是 1 ，1 个用户的用户活跃分钟数是 2
      因此，answer[1] = 1 ，answer[2] = 1 ，其余的值都是 0