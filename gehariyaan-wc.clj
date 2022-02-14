;; This buffer is for text that is not saved, and for Lisp evaluation.
;; To create a file, visit it with C-x C-f and enter text in its buffer.


(def simpl ["okay" "this" "way" "its" "take" "it" "that" "with" "is" "our" "new" "home" "hmm" "for" "how" "long" "ma" "will" "i" "get" "to" "meet"  "and" "now" "said" "us" "" "go" "me" "stop" "no" "one" "my" "turn" "look" "over" "here" "you" "lost" "dont" "be" "we" "can" "why" "not" "am" "isnt" "easy" "but" "a" "if" "want" "wait" "dear" "so" "let" "give" "demo" "of" "the" "have" "list" "do" "know" "tree" "say" "he" "show" "line" "move" "anda" "red" "oh" "just" "itll" "up" "was" "must" "call" "well" "once" "made" "more" "yeah" "sure" "fix" "set" "had" "in" "shit" "at" "make" "she" "back" "ever" "what" "wish" "less" "time" "78" "on" "see" "door" "many" "ask" "pick" "ill" "half" "like" "live" "shes" "your" "plus" "trip" "been" "two" "her" "away" "due" "next" "days" "life" "does" "real" "hes" "him" "an" "wont" "even" "pay" "then" "tee" "weve" "maam" "were" "good" "hi" "cant" "8" "put" "al" "bit" "nice" "shut" "head" "guys" "same" "hey" "man" "wow" "ride" "im" "ones" "year" "his" "are" "lets" "got" "shat" "some" "come" "too" "need" "la" "dads" "sort" "out" "poor" "guy" "when" "hows" "farm" "by" "went" "from" "ads" "hand" "wash" "died" "999" "did" "3" "ago" "off" "cmon" "they" "seem" "grew" "them" "only" "much" "yep" "baby" "lazy" "pool" "last" "area" "work" "wooh" "mike" "mad" "heat" "cold" "fine" "both" "left" "quit" "meal" "prep"  "soon" "such" "ice" "tell" "ouch" "huh" "pass" "ive" "430" "wake" "soul" "who" "bed" "8pm" "down" "dude" "toes" "jump" "dump" "fish" "sea" "done" "or" "race" "into" "run" "feel" "mind" "told" "hook" "id" "old" "5" "glad" "keep" "idea" "all" "rich" "yet" "may" "add" "than" "mma" "step" "leap" "kind" "brat" "type" "yes" "else" "4" "read" "book" "gets" "own" "wear" "help" "yea" "try" "hold" "cute" "talk" "seen" "sit" "has" "met" "stay" "town" "air" "cash" "bank" "90" "loan" "gap" "70" "plan" "word" "week" "bulk" "deal" "lock" "six" "6" "sent" "gift" "eat" "aww" "text" "dvd" "fold" "undo" "bend" "lift" "leg" "born" "took" "find" "visa" "knew" "came" "end" "lied" "hour" "lot" "day" "drop" "as" "keys" "umm" "11" "wine" "play" "1796" "uber" "car" "mail" "pain" "miss" "bye" "safe" "big" "mean" "mat" "cab" "says" "scar" "wild" "wed" "fund" "game" "seed" "1" "team" "hed" "hit" "10th" "arm" "cops" "gave" "hurt" "most" "felt" "aw" "clue" "free" "knee" "care" "girl" "hot" "140" "14" "gold" "also" "ah" "join" "fat" "far" "snap" "god" "sane" "ring" "fell" "walk" "firm" "past" "mine" "busy" "push" "son" "send" "fits" "any" "act" "best" "sake" "4am" "aged" "toby" "tea" "very" "hung" "used" "kids" "2am" "dead" "gone" "shed" "sir" "asap" "huge" "hate" "side" "cool" "cabs" "hear" "few" "10" "none" "rest" "2" "yup" "sail" "bet" "whos" "bear" "cat" "24th" "6pm" "boat" "80" "name" "20" "damn" "skip" "ton" "shot" "ed" "cfo" "sen" "6065" "four" "saw" "taj" "rude" "blow" "road" "exit" "8ft" "deep" "hill" "ec" "tax" "4pm" "axe" "cbi" "eds" "msd" "late" "boss" "30" "236" "dial" "roi" "roof" "7030" "tied" "room" "page" "17" "hope" "mint" "600" "8020" "340" "per" "sue" "tv" "calm" "buy" "3am" "able" "pune" "five" "till" "ours" "body" "onto" "bag" "lead" "case" "rot" "face" "sold" "sale" "sell" "file" "cut" "ii" "sec" "open" "hers" "kept" "taxi" "jet" "loop" "pork" "bao"])
  


(->>
 (clojure.string/split (slurp "Gehraiyaan (2022).srt") #" ")
 (map clojure.string/lower-case)
 (filter (fn[x](not (some (partial = x) simpl))))
 (frequencies)
 (sort-by val)
 (reverse)
 (take 20))


 
 
(->>
 (clojure.string/split (slurp "Gehraiyaan (2022).srt") #" ")
 (map clojure.string/lower-case)
 (filter (fn[x](not (some (partial = x) simpl))))
 (frequencies)
 (sort-by val)
 (reverse)
 (take 20))
     
