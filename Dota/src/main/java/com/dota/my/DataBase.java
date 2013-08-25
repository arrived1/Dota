package com.dota.my;

import java.util.Vector;

public class DataBase {
    public Vector<Hero> heroes;

    public DataBase() {
        heroes = new Vector<Hero>();

        heroes.add(new Hero("Earthshaker",
                R.drawable.earthshaker_full,
                R.drawable.earthshaker_fissure_hp1,
                R.drawable.earthshaker_enchant_totem_hp1,
                R.drawable.earthshaker_aftershock_hp1,
                R.drawable.earthshaker_echo_slam_hp1));

        heroes.add(new Hero("Sven",
                R.drawable.sven_full,
                R.drawable.sven_storm_bolt_hp1,
                R.drawable.sven_great_cleave_hp1,
                R.drawable.sven_warcry_hp1,
                R.drawable.sven_gods_strength_hp1));

        heroes.add(new Hero("Tiny",
                R.drawable.tiny_full,
                R.drawable.tiny_avalanche_hp1,
                R.drawable.tiny_toss_hp1,
                R.drawable.tiny_craggy_exterior_hp1,
                R.drawable.tiny_grow_hp1));

        heroes.add(new Hero("Kunkka",
                R.drawable.kunkka_full,
                R.drawable.kunkka_torrent_hp1,
                R.drawable.kunkka_tidebringer_hp1,
                R.drawable.kunkka_x_marks_the_spot_hp1,
                R.drawable.kunkka_ghostship_hp1));

        heroes.add(new Hero("Beastmaster",
                R.drawable.beastmaster_full,
                R.drawable.beastmaster_wild_axes_hp1,
                R.drawable.beastmaster_call_of_the_wild_hp1,
                R.drawable.beastmaster_inner_beast_hp1,
                R.drawable.beastmaster_primal_roar_hp1));

        heroes.add(new Hero("DragonKnight",
                R.drawable.dragon_knight_full,
                R.drawable.dragon_knight_breathe_fire_hp1,
                R.drawable.dragon_knight_dragon_tail_hp1,
                R.drawable.dragon_knight_dragon_blood_hp1,
                R.drawable.dragon_knight_elder_dragon_form_hp1));

        heroes.add(new Hero("Clockwerk",
                R.drawable.rattletrap_full,
                R.drawable.rattletrap_battery_assault_hp1,
                R.drawable.rattletrap_power_cogs_hp1,
                R.drawable.rattletrap_rocket_flare_hp1,
                R.drawable.rattletrap_hookshot_hp1));

        heroes.add(new Hero("OmniKnight",
                R.drawable.omniknight_full,
                R.drawable.omniknight_purification_hp1,
                R.drawable.omniknight_repel_hp1,
                R.drawable.omniknight_degen_aura_hp1,
                R.drawable.omniknight_guardian_angel_hp1));

        heroes.add(new Hero("Huskar",
                R.drawable.huskar_full,
                R.drawable.huskar_inner_vitality_hp1,
                R.drawable.huskar_burning_spear_hp1,
                R.drawable.huskar_berserkers_blood_hp1,
                R.drawable.huskar_life_break_hp1));

        heroes.add(new Hero("Alchemist",
                R.drawable.alchemist_full,
                R.drawable.alchemist_acid_spray_hp1,
                R.drawable.alchemist_unstable_concoction_hp1,
                R.drawable.alchemist_goblins_greed_hp1,
                R.drawable.alchemist_chemical_rage_hp1));

        heroes.add(new Hero("Brewmaster",
                R.drawable.brewmaster_full,
                R.drawable.brewmaster_thunder_clap_hp1,
                R.drawable.brewmaster_drunken_haze_hp1,
                R.drawable.brewmaster_drunken_brawler_hp1,
                R.drawable.brewmaster_primal_split_hp1));

        heroes.add(new Hero("TreantProtector",
                R.drawable.treant_full,
                R.drawable.treant_natures_guise_hp1,
                R.drawable.treant_leech_seed_hp1,
                R.drawable.treant_living_armor_hp1,
                R.drawable.treant_overgrowth_hp1));

        heroes.add(new Hero("Io",
                R.drawable.wisp_full,
                R.drawable.wisp_tether_hp1,
                R.drawable.wisp_spirits_hp1,
                R.drawable.wisp_overcharge_hp1,
                R.drawable.wisp_relocate_hp1));

        heroes.add(new Hero("CentaurWarrunner",
                R.drawable.centaur_full,
                R.drawable.centaur_hoof_stomp_hp1,
                R.drawable.centaur_double_edge_hp1,
                R.drawable.centaur_return_hp1,
                R.drawable.centaur_stampede_hp1));

        heroes.add(new Hero("Timbersaw",
                R.drawable.shredder_full,
                R.drawable.shredder_whirling_death_hp1,
                R.drawable.shredder_timber_chain_hp1,
                R.drawable.shredder_reactive_armor_hp1,
                R.drawable.shredder_chakram_hp1));

        heroes.add(new Hero("BristleBack",
                R.drawable.bristleback_full,
                R.drawable.bristleback_viscous_nasal_goo_hp1,
                R.drawable.bristleback_quill_spray_hp1,
                R.drawable.bristleback_bristleback_hp1,
                R.drawable.bristleback_warpath_hp1));

        heroes.add(new Hero("Tuskar",
                R.drawable.tusk_full,
                R.drawable.tusk_ice_shards_hp1,
                R.drawable.tusk_snowball_hp1,
                R.drawable.tusk_frozen_sigil_hp1,
                R.drawable.tusk_walrus_punch_hp1));

        heroes.add(new Hero("ElderTitan",
                R.drawable.elder_titan_full,
                R.drawable.elder_titan_echo_stomp_hp1,
                R.drawable.elder_titan_ancestral_spirit_hp1,
                R.drawable.elder_titan_natural_order_hp1,
                R.drawable.elder_titan_earth_splitter_hp1));

        heroes.add(new Hero("Axe",
                R.drawable.axe_full,
                R.drawable.axe_berserkers_call_hp1,
                R.drawable.axe_battle_hunger_hp1,
                R.drawable.axe_counter_helix_hp1,
                R.drawable.axe_culling_blade_hp1));

        heroes.add(new Hero("Pudge",
                R.drawable.pudge_full,
                R.drawable.pudge_meat_hook_hp1,
                R.drawable.pudge_rot_hp1,
                R.drawable.pudge_flesh_heap_hp1,
                R.drawable.pudge_dismember_hp1));

        heroes.add(new Hero("SandKing",
                R.drawable.sand_king_full,
                R.drawable.sandking_burrowstrike_hp1,
                R.drawable.sandking_sand_storm_hp1,
                R.drawable.sandking_caustic_finale_hp1,
                R.drawable.sandking_epicenter_hp1));

        heroes.add(new Hero("Slardar",
                R.drawable.slardar_full,
                R.drawable.slardar_sprint_hp1,
                R.drawable.slardar_slithereen_crush_hp1,
                R.drawable.slardar_bash_hp1,
                R.drawable.slardar_amplify_damage_hp1));

        heroes.add(new Hero("Tidehunter",
                R.drawable.tidehunter_full,
                R.drawable.tidehunter_gush_hp1,
                R.drawable.tidehunter_kraken_shell_hp1,
                R.drawable.tidehunter_anchor_smash_hp1,
                R.drawable.tidehunter_ravage_hp1));

        heroes.add(new Hero("SkeletonKing",
                R.drawable.skeleton_king_full,
                R.drawable.skeleton_king_hellfire_blast_hp1,
                R.drawable.skeleton_king_vampiric_aura_hp1,
                R.drawable.skeleton_king_mortal_strike_hp1,
                R.drawable.skeleton_king_reincarnation_hp1));

        heroes.add(new Hero("Lifestealer",
                R.drawable.life_stealer_full,
                R.drawable.life_stealer_rage_hp1,
                R.drawable.life_stealer_feast_hp1,
                R.drawable.life_stealer_open_wounds_hp1,
                R.drawable.life_stealer_infest_hp1));

        heroes.add(new Hero("NightStalker",
                R.drawable.night_stalker_full,
                R.drawable.night_stalker_void_hp1,
                R.drawable.night_stalker_crippling_fear_hp1,
                R.drawable.night_stalker_hunter_in_the_night_hp1,
                R.drawable.night_stalker_darkness_hp1));

        heroes.add(new Hero("Doom",
                R.drawable.doom_bringer_full,
                R.drawable.doom_bringer_devour_hp1,
                R.drawable.doom_bringer_scorched_earth_hp1,
                R.drawable.doom_bringer_lvl_death_hp1,
                R.drawable.doom_bringer_doom_hp1));

        heroes.add(new Hero("SpiritBreaker",
                R.drawable.spirit_breaker_full,
                R.drawable.spirit_breaker_charge_of_darkness_hp1,
                R.drawable.spirit_breaker_empowering_haste_hp1,
                R.drawable.spirit_breaker_greater_bash_hp1,
                R.drawable.spirit_breaker_nether_strike_hp1));

        heroes.add(new Hero("Lycanthrope",
                R.drawable.lycan_full,
                R.drawable.lycan_summon_wolves_hp1,
                R.drawable.lycan_howl_hp1,
                R.drawable.lycan_feral_impulse_hp1,
                R.drawable.lycan_shapeshift_hp1));

        heroes.add(new Hero("ChaosKnight",
                R.drawable.chaos_knight_full,
                R.drawable.chaos_knight_chaos_bolt_hp1,
                R.drawable.chaos_knight_reality_rift_hp1,
                R.drawable.chaos_knight_chaos_strike_hp1,
                R.drawable.chaos_knight_phantasm_hp1));

        heroes.add(new Hero("Undying",
                R.drawable.undying_full,
                R.drawable.undying_decay_hp1,
                R.drawable.undying_soul_rip_hp1,
                R.drawable.undying_tombstone_hp1,
                R.drawable.undying_flesh_golem_hp1));

        heroes.add(new Hero("Magnus",
                R.drawable.magnataur_full,
                R.drawable.magnataur_shockwave_hp1,
                R.drawable.magnataur_empower_hp1,
                R.drawable.magnataur_skewer_hp1,
                R.drawable.magnataur_reverse_polarity_hp1));

        heroes.add(new Hero("Abaddon",
                R.drawable.abaddon_full,
                R.drawable.abaddon_death_coil_hp1,
                R.drawable.abaddon_aphotic_shield_hp1,
                R.drawable.abaddon_frostmourne_hp1,
                R.drawable.abaddon_borrowed_time_hp1));

//        heroes.add(new Hero("",
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.));
    }

    public Hero getHero(int idx) {
        return heroes.get(idx);
    }

    public int size() {
        return heroes.size();
    }
}
