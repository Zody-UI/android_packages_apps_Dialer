/*
 * Copyright (C) 2019 The MoKee Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer.smartdial.map;

import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;

import com.android.dialer.dialpadview.DialpadCharMappings;
import com.android.dialer.smartdial.util.SmartDialMatchPosition;
import com.android.dialer.smartdial.util.SmartDialNameMatcher;
import com.android.providers.contacts.HanziToPinyin;
import com.google.common.base.Optional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChineseSmartDialMap extends SmartDialMap {

    private static ChineseSmartDialMap instance;

    static ChineseSmartDialMap getInstance() {
        if (instance == null) {
            instance = new ChineseSmartDialMap();
        }

        return instance;
    }

    private ChineseSmartDialMap() {}

    /*
     * The switch statement in this function was generated using the python code:
     * from unidecode import unidecode
     * for i in range(192, 564):
     *     char = unichr(i)
     *     decoded = unidecode(char)
     *     # Unicode characters that decompose into multiple characters i.e.
     *     #  into ss are not supported for now
     *     if (len(decoded) == 1 and decoded.isalpha()):
     *         print "case '" + char + "': return Optional.of('" + unidecode(char) +  "');"
     *
     * This gives us a way to map characters containing accents/diacritics to their
     * alphabetic equivalents. The unidecode library can be found at:
     * http://pypi.python.org/pypi/Unidecode/0.04.1
     *
     * Also remaps all upper case latin characters to their lower case equivalents.
     */
    @Override
    Optional<Character> normalizeCharacter(char ch) {
        if (isValidDialpadAlphabeticChar(ch)) {
            return Optional.of(ch);
        }

        switch (ch) {
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('x');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('j');
            case '??':
                return Optional.of('j');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('w');
            case '??':
                return Optional.of('w');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('b');
            case '??':
                return Optional.of('b');
            case '??':
                return Optional.of('b');
            case '??':
                return Optional.of('b');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('c');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('f');
            case '??':
                return Optional.of('f');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('l');
            case '??':
                return Optional.of('w');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('p');
            case '??':
                return Optional.of('p');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('v');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('w');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('k');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('j');
            case '??':
                return Optional.of('d');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('g');
            case '??':
                return Optional.of('w');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('n');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('i');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('r');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('u');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('s');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('t');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('h');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('z');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('a');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('e');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('o');
            case '??':
                return Optional.of('y');
            case '??':
                return Optional.of('y');
            case 'A':
                return Optional.of('a');
            case 'B':
                return Optional.of('b');
            case 'C':
                return Optional.of('c');
            case 'D':
                return Optional.of('d');
            case 'E':
                return Optional.of('e');
            case 'F':
                return Optional.of('f');
            case 'G':
                return Optional.of('g');
            case 'H':
                return Optional.of('h');
            case 'I':
                return Optional.of('i');
            case 'J':
                return Optional.of('j');
            case 'K':
                return Optional.of('k');
            case 'L':
                return Optional.of('l');
            case 'M':
                return Optional.of('m');
            case 'N':
                return Optional.of('n');
            case 'O':
                return Optional.of('o');
            case 'P':
                return Optional.of('p');
            case 'Q':
                return Optional.of('q');
            case 'R':
                return Optional.of('r');
            case 'S':
                return Optional.of('s');
            case 'T':
                return Optional.of('t');
            case 'U':
                return Optional.of('u');
            case 'V':
                return Optional.of('v');
            case 'W':
                return Optional.of('w');
            case 'X':
                return Optional.of('x');
            case 'Y':
                return Optional.of('y');
            case 'Z':
                return Optional.of('z');
            default:
                return Optional.absent();
        }
    }

    @Override
    SimpleArrayMap<Character, Character> getCharToKeyMap() {
        return DialpadCharMappings.getDefaultCharToKeyMap();
    }

    /*
     * Generates a space delimited string of pinyins
     */
    private String tokenizeToPinyins(String displayName) {
        HanziToPinyin hanziToPinyin = HanziToPinyin.getInstance();
        ArrayList<HanziToPinyin.Token> tokens = hanziToPinyin.getTokens(displayName);
        ArrayList<String> pinyins = new ArrayList<String>();
        for (HanziToPinyin.Token token : tokens) {
            if (token.type != HanziToPinyin.Token.PINYIN) {
                return displayName;
            } else {
                pinyins.add(token.target);
            }
        }
        return TextUtils.join(" ", pinyins);
    }

    @Override
    public String transliterateName(String index) {
        return tokenizeToPinyins(index);
    }

    /*
     * Uses the default matching logic on the pinyin name and attempts to map the match positions
     * back to the original display name
     */
    @Override
    public boolean matchesCombination(Context context, SmartDialNameMatcher smartDialNameMatcher,
            String displayName, String query, ArrayList<SmartDialMatchPosition> matchList) {

        String pinyinName = tokenizeToPinyins(displayName);

        ArrayList<SmartDialMatchPosition> computedMatchList = new ArrayList<>();
        boolean matches = smartDialNameMatcher.matchesCombination(context, pinyinName, query, computedMatchList);
        if (!matches)
            return false;

        // name was translated to pinyin before matching.  attempt to map the match positions
        // back to the original display string
        if (!displayName.equals(pinyinName)) {

            // construct an array that maps each character of the pinyin name back to the index of
            // the hanzi token from which it came
            // For example, if:
            //  displayName = ?????????
            //  pinyinName =  "hong xia li"
            // then:
            //  pinyinMapping = 0,0,0,0,-1,1,1,1,-1,2,2
            int[] pinyinMapping = new int[pinyinName.length()];
            int curToken = 0;
            for (int i=0; i < pinyinName.length(); ++i) {
                char c = pinyinName.charAt(i);
                if (c == ' ') {
                    ++curToken;
                    pinyinMapping[i] = -1;
                }
                else {
                    pinyinMapping[i] = curToken;
                }
            }

            // calculate unique hanzi characters that are matched
            Set<Integer> positionsToHighlight = new HashSet<>();
            for (SmartDialMatchPosition matchPosition : computedMatchList) {
                for (int pos = matchPosition.start; pos < matchPosition.end; ++pos) {
                    int mappedPos = pinyinMapping[pos];
                    if (mappedPos >= 0)
                        positionsToHighlight.add(mappedPos);
                }
            }

            // reset computed matches
            computedMatchList = new ArrayList<>();
            for (int matchPos : positionsToHighlight) {
                // use one object per position for simplicity
                computedMatchList.add(new SmartDialMatchPosition(matchPos, matchPos+1));
            }
        }

        matchList.addAll(computedMatchList);
        return true;
    }

}
