package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I41Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i45Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i48Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b28Provider.get(request);
		int p9Val = b29Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b31Provider.get(request);
		int p12Val = b33Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = b50Provider.get(request);
		int p19Val = i42Provider.get(request);
		int p20Val = i45Provider.get(request);
		int p21Val = i47Provider.get(request);
		int p22Val = i48Provider.get(request);
		int p23Val = i50Provider.get(request);
		int p24Val = i53Provider.get(request);
		int p25Val = i56Provider.get(request);
		int p26Val = i58Provider.get(request);
		int p27Val = i60Provider.get(request);
		int p28Val = i67Provider.get(request);
		int p29Val = i73Provider.get(request);
		
        try {
            Thread.sleep(52);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(36);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p30Val = i74Provider.get(request);
		int p31Val = i76Provider.get(request);
		int p32Val = i77Provider.get(request);
		int p33Val = i78Provider.get(request);
		int p34Val = i84Provider.get(request);
		int p35Val = i90Provider.get(request);
		int p36Val = i91Provider.get(request);
		int p37Val = i92Provider.get(request);
		int p38Val = i93Provider.get(request);
		int p39Val = i95Provider.get(request);
		int p40Val = i96Provider.get(request);
		int p41Val = i97Provider.get(request);
		int p42Val = i98Provider.get(request);
		int p43Val = i100Provider.get(request);
		int p44Val = i104Provider.get(request);
		int p45Val = i106Provider.get(request);
		
        try {
            Thread.sleep(89);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p46Val = i108Provider.get(request);
		int p47Val = i109Provider.get(request);
		int p48Val = i112Provider.get(request);
		int p49Val = i113Provider.get(request);
		int p50Val = i114Provider.get(request);
		int p51Val = i116Provider.get(request);
		int p52Val = i120Provider.get(request);
		int p53Val = i123Provider.get(request);
		int p54Val = i124Provider.get(request);
		int p55Val = i128Provider.get(request);
		int p56Val = i129Provider.get(request);
		int p57Val = i130Provider.get(request);
		int p58Val = i134Provider.get(request);
		int p59Val = i135Provider.get(request);
		int p60Val = i136Provider.get(request);
		int p61Val = i138Provider.get(request);
		int p62Val = i139Provider.get(request);
		int p63Val = i140Provider.get(request);
		int p64Val = i142Provider.get(request);
		int p65Val = i147Provider.get(request);
		int p66Val = i149Provider.get(request);
		int p67Val = i150Provider.get(request);
		int p68Val = i151Provider.get(request);
		int p69Val = i153Provider.get(request);
		int p70Val = i158Provider.get(request);
		int p71Val = i159Provider.get(request);
		int p72Val = i160Provider.get(request);
		int p73Val = i163Provider.get(request);
		int p74Val = i165Provider.get(request);
		int p75Val = i172Provider.get(request);
		int p76Val = i174Provider.get(request);
		int p77Val = i175Provider.get(request);
		int p78Val = i176Provider.get(request);
		int p79Val = i177Provider.get(request);
		int p80Val = i180Provider.get(request);
		int p81Val = i183Provider.get(request);
		int p82Val = i187Provider.get(request);
		int p83Val = i196Provider.get(request);
		int p84Val = i197Provider.get(request);
		int p85Val = i200Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val +
				p83Val +
				p84Val +
				p85Val;
    }
}
