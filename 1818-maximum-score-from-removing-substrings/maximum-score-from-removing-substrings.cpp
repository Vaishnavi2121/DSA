class Solution {
public:
    int maximumGain(string s, int x, int y) {
      vector<char> v, v1;
      int ans = 0;
      int flag = 0;
      if(x>y) flag=1;
      else flag =0;
        for(auto pointer:s){
            if(!v.empty()){
                if(flag){
                    if(v.back()=='a' && pointer == 'b'){
                        ans = ans+x;
                        v.pop_back();
                    } else v.push_back(pointer);
                    } else {
                        if(v.back()=='b' && pointer == 'a'){
                            ans = ans+y;
                            v.pop_back();
                        }
                    else v.push_back(pointer);
                }
            }
            else v.push_back(pointer);
        }
        for(auto pointer:v){
            if(!v1.empty()){
                if(!flag){
                    if(v1.back()=='a' && pointer == 'b'){
                        ans = ans+x;
                        v1.pop_back();
                    } else v1.push_back(pointer);
                    } else {
                        if(v1.back()=='b' && pointer == 'a'){
                            ans = ans+y;
                            v1.pop_back();
                        }
                    else v1.push_back(pointer);
                }
            }
            else v1.push_back(pointer);
        }
        return ans;
    }
}; 